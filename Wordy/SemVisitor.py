from WordyVisitor import WordyVisitor
from WordyParser import WordyParser
from SymTableStuff.SymTable import *
from SymTableStuff.SymTableEntry import *
from SymTableStuff.SymTableStack import *
from WordyErrors import *
from SymTableStuff.RoutineInfo import *
from VarType import *
class SemVisitor(WordyVisitor):
    # TODO: How to handle floats

    # runtime stack contains stack frames
    # Stack frames contain sym table entries
    symtable:SymTableStack
    isInFunc:bool
    isInThing:bool
    usedAsInput:list

    def __init__(self, *args, **kwargs):
        self.symtable = SymTableStack()
        self.isInFunc = False
        self.isInThing = False
        self.usedAsInput = []
        super().__init__(*args, **kwargs)

    def visitProgram(self, ctx:WordyParser.ProgramContext):
        return self.visitChildren(ctx)

    def visitExpression(self, ctx:WordyParser.ExpressionContext):
        type = VarType.NONE
        if ctx.funcCall() is not None:
            funcId = ctx.funcCall().IDENTIFIER().getText()
            entryInfo = self.symtable.lookup(funcId)
            if entryInfo is None:
                raise ERROR_NAME_MUST_BE_PROCEDURE()
            routineInfo = entryInfo.value
            type = routineInfo.outputType
        elif ctx.stringTerm() is not None and len(ctx.stringTerm()) > 0:
            type = VarType.STRING
        elif ctx.numExpression() is not None and len(ctx.numExpression()) > 0:
            type = VarType.FLOAT
        elif ctx.relOpExpr() is not None:
            type = VarType.BOOL
        ctx.type = type
        return self.visitChildren(ctx)

    def visitVarValue(self, ctx:WordyParser.VarValueContext):
        varType: VarType = VarType.NONE
        if ctx.number() is not None:
            varType = VarType.FLOAT
        elif ctx.stringTerm() is not None:
            varType = VarType.STRING
        elif ctx.expression() is not None:
            self.visit(ctx.expression())
            varType = ctx.expression().type
        elif ctx.bool_() is not None:
            varType = VarType.BOOL
        elif ctx.array() is not None:
            self.visit(ctx.array())
            varType = ctx.array().type
        elif ctx.arrayQuery() is not None:
            self.visit(ctx.arrayQuery())
            varType = ctx.arrayQuery().type
        elif ctx.INPUT() is not None:
            varType = VarType.STRING_ARRAY
        elif ctx.newThing():
            self.visit(ctx.newThing())
            thingId = ctx.newThing().IDENTIFIER()
            varType = thingId
        elif ctx.propCall():
            self.visit(ctx.propCall())
            varType = ctx.propCall().type
        # elif ctx.relOpExpr():
        #     self.visit(ctx.relOpExpr())
        #     varType = VarType.BOOL
        elif ctx.IDENTIFIER():
            identifier = ctx.IDENTIFIER().getText()
            entry = self.lookupIdEntry(identifier)
            varType = entry.varType
        ctx.type = varType
        return self.visitChildren(ctx)

    def visitNewThing(self, ctx:WordyParser.NewThingContext):
        pass
    def visitPropCall(self, ctx:WordyParser.PropCallContext):
        thingVarId = ctx.IDENTIFIER(0).getText()
        thingVarEntry = self.lookupIdEntry(thingVarId)
        thingVarSymTable:SymTable = thingVarEntry.value
        thingPropId = ctx.IDENTIFIER(1).getText()
        thingVarPropEntry = thingVarSymTable.lookup(thingPropId)
        if thingVarPropEntry is None:
            raise INVALID_FIELD()
        self.visit(thingVarPropEntry.value)
        ctx.type = thingVarPropEntry.varType



    def visitArray(self, ctx:WordyParser.ArrayContext):
        childVisit = self.visitChildren(ctx)
        term: VarType
        firstTerm = ctx.arrayTerm(0)
        for i in range(len(ctx.arrayTerm())):
            term = ctx.arrayTerm(i)
            if term.type is not firstTerm.type:
                raise TYPE_MISMATCH()
        match firstTerm.type:
            case VarType.STRING:
                ctx.type = VarType.STRING_ARRAY
            case VarType.FLOAT:
                ctx.type = VarType.NUM_ARRAY
            case VarType.BOOL:
                ctx.type = VarType.BOOL_ARRAY
        return childVisit

    def visitArrayQuery(self, ctx:WordyParser.ArrayQueryContext):
        arrayEntry = self.lookupIdEntry(ctx.IDENTIFIER(0).getText())
        arrVal:WordyParser.ArrayContext = arrayEntry.value.array()
        if ctx.unsignedNumber() is not None:
            index = int(ctx.unsignedNumber().getText())
        else:
            idLookup = self.lookupIdEntry(ctx.IDENTIFIER(1).getText())
            if idLookup.varType is not VarType.FLOAT:
                raise TYPE_MISMATCH()
            index = int(idLookup.value.getText())
        arrTerm = arrVal.arrayTerm(index)
        ctx.type = arrTerm.type
        return self.visit(arrTerm)


    def visitArrayTerm(self, ctx:WordyParser.ArrayTermContext):
        childVisit = self.visitChildren(ctx)
        if ctx.stringTerm() is not None:
            ctx.type = VarType.STRING
        elif ctx.numExpression() is not None:
            ctx.type = VarType.FLOAT
        elif ctx.bool_() is not None:
            ctx.type = VarType.BOOL
        elif ctx.IDENTIFIER() is not None:
            entry = self.lookupIdEntry(ctx.IDENTIFIER().getText())
            ctx.type = entry.varType
        return childVisit

    def lookupIdEntry(self, variable, throws =True):
        entry = self.symtable.lookup(variable)
        if entry is None:
            if throws:
                raise UNDECLARED_IDENTIFIER
            else:
                return None
        else:
            return entry

    def visitDefThing(self, ctx: WordyParser.DefThingContext):
        thingName = ctx.IDENTIFIER().getText()

        currentEntry = self.symtable.lookup(thingName)
        if self.isInFunc:
            raise ERROR_DEFINED_THING_IN_FUNC()
        self.isInThing = True
        #If already exists, throw error
        if currentEntry is not None:
            #TODO: Test this
            raise REDECLARED_IDENTIFIER()
        symTable = SymTable(0)
        for i in range(len(ctx.assignStmt())):
            stmt = ctx.assignStmt(i)
            if stmt.assignVar() is not None:
                assign = stmt.assignVar()
                kind = Kind.VARIABLE
            else:
                assign = stmt.assignVarConst()
                kind = Kind.CONSTANT
            propId = assign.variable().getText()
            existingPropEntry = symTable.lookup(propId)
            if existingPropEntry is not None:
                raise REDECLARED_IDENTIFIER()
            if assign.varValue().INPUT() is not None or assign.varValue().getText() in self.usedAsInput:
                raise ERROR_INPUT_USED_INCORRECTLY()
            self.visit(assign.varValue())
            propValue = assign.varValue()
            propEntry = symTable.enter(propId, kind)
            propEntry.value = propValue
            propEntry.varType = propValue.type
        entry = self.symtable.enterLocal(thingName, Kind.TYPE)
        entry.value = symTable
        entry.varType = VarType.THING_DEF
        self.isInThing = False

    def visitAssignVar(self, ctx:WordyParser.AssignVarContext):
        variable = ctx.variable().IDENTIFIER().getText()
        varValue = ctx.varValue()
        self.assignVar(variable, varValue)
        if ctx.varValue().INPUT() is not None:
            self.usedAsInput.append(variable)
        return None

    def assignVar(self, variable, varValue, isConstant =False):
        currentEntry = self.symtable.lookup(variable)
        self.visit(varValue)
        if currentEntry is not None:
            if isConstant:
                redeclared = (currentEntry.kind is Kind.VARIABLE or Kind.CONSTANT)
            else:
                redeclared = (currentEntry.kind is Kind.CONSTANT)
            if redeclared is True:
                raise REDECLARED_IDENTIFIER()
            entryValue = currentEntry.value
            if varValue is not None:
                self.visit(varValue)
                self.visit(entryValue)
                lType: VarType = entryValue.type
                rType: VarType = varValue.type
                if rType is not lType:
                    raise INCOMPATIBLE_ASSIGNMENT()

        value = varValue
        if varValue.__class__ is WordyParser.VarValueContext and varValue.newThing() is not None:
            newThing: WordyParser.NewThingContext = varValue.newThing()
            thingEntry:SymTableEntry = self.lookupIdEntry(newThing.IDENTIFIER().getText())
            thingSymTable = SymTable(dictToCopy=thingEntry.value.dict)
            value = thingSymTable
        if isConstant:
            kind = Kind.CONSTANT
        else:
            kind = Kind.VARIABLE
        entry = self.symtable.enterLocal(variable, kind)
        entry.value = value
        entry.varType = varValue.type

    def visitAssignVarConst(self, ctx:WordyParser.AssignVarConstContext):
        variable = ctx.variable().IDENTIFIER().getText()
        varValue = ctx.varValue()
        if varValue.getText() in self.usedAsInput or varValue.INPUT() is not None:
            raise ERROR_INPUT_USED_INCORRECTLY()
        self.assignVar(variable, varValue, True)
        return None

    def visitStringTerm(self, ctx:WordyParser.StringTermContext):
        if ctx.concat():
            return self.visit(ctx.concat())
        if ctx.stringConstant():
            return self.visit(ctx.stringConstant())
        if ctx.funcCall():
            return self.visit(ctx.funcCall())
        if ctx.IDENTIFIER():
            entry = self.symtable.lookup(ctx.IDENTIFIER().getText())
            if entry is None:
                raise UNDECLARED_IDENTIFIER()
            else:
                if entry.value is not None:
                    return self.visit(entry.value)
                else:
                    return None


    def visitVariableFactor(self, ctx:WordyParser.VariableFactorContext):
        variable = ctx.variable().IDENTIFIER().getText()
        entry = self.symtable.lookup(variable)
        if entry is None:
            raise UNDECLARED_IDENTIFIER()
        return entry.value

    def visitDefFunc(self, ctx:WordyParser.DefFuncContext):
        if self.isInFunc:
            raise ERROR_DEFINED_FUNC_IN_FUNC()
        self.isInFunc = True
        funcId = ctx.IDENTIFIER().getText()
        currentEntry = self.symtable.lookup(funcId)
        if currentEntry is not None:
            raise REDECLARED_IDENTIFIER()
        info = RoutineInfo()
        info.context = ctx
        outputTypeStr = ctx.returnType().getText().lower()
        outputType: VarType = VarType.NONE
        match outputTypeStr:
            case 'word':
                outputType = VarType.STRING
            case 'strings':
                outputType = VarType.STRING
            case 'int':
                outputType = VarType.INT
            case 'float':
                outputType = VarType.FLOAT
            case 'bool':
                outputType = VarType.BOOL
        info.outputType = outputType
        for i in range(len(ctx.defParam())):
            param = ctx.defParam(i)
            info.args.append(param)
        entry = self.symtable.enterLocal(funcId, info)
        entry.value = info
        visit = self.visitChildren(ctx)
        self.isInFunc = False
        return visit

    def visitFuncCall(self, ctx:WordyParser.FuncCallContext):
        identifier = ctx.IDENTIFIER().getText()
        entry = self.symtable.lookup(identifier)
        if entry is None:
            raise ERROR_NAME_MUST_BE_PROCEDURE()
        value:RoutineInfo = entry.value
        if len(value.args) is not len(ctx.funcCallArg()):
            raise ARGUMENT_COUNT_MISMATCH()
        # self.symtable.push()
        for i in range(len(ctx.funcCallArg())):
            arg = ctx.funcCallArg(i)
            variable = value.args[i].IDENTIFIER().getText()
            varValue = self.visit(arg)
            self.assignVar(variable, varValue)

        funcBody = value.context.funcBody()
        body = self.visitChildren(funcBody)
        # self.symtable.pop()
        return body

    def visitFuncCallArg(self, ctx:WordyParser.FuncCallArgContext):
        if ctx.IDENTIFIER() is not None:
            entry = self.lookupIdEntry(ctx.IDENTIFIER().getText())
            self.visit(entry.value)
            return entry.value
        else:
            self.visit(ctx.varValue())
            return ctx.varValue()

    def visitLoopEachStmt(self, ctx:WordyParser.LoopEachStmtContext):
        variable = ctx.IDENTIFIER(0).getText()
        if len(ctx.IDENTIFIER()) > 1:
            array = self.lookupIdEntry(ctx.IDENTIFIER(1).getText()).value.array()
            varValue = array.arrayTerm(0)
        else:
            array = ctx.array()
            varValue = array.arrayTerm(0)
        #TODO: if identifier, lookup first value of array. If literal, do first value
        self.assignVar(variable, varValue)
        return self.visit(ctx.curlyStatementList())

    def visitOutputStmt(self, ctx:WordyParser.OutputStmtContext):
        funcId = ctx.parentCtx.parentCtx.IDENTIFIER().getText()
        currentEntry = self.symtable.lookup(funcId)
        declaredOutputType = currentEntry.value.outputType
        actualOutputType = None
        if ctx.IDENTIFIER() is not None:
            outputVal = ctx.IDENTIFIER().getText()
            outputIdEntry = self.symtable.lookup(outputVal)
            actualOutputType = outputIdEntry.varType
        elif ctx.expression() is not None:
            outputVal = ctx.expression()
            self.visit(outputVal)
            actualOutputType = outputVal.type
        if actualOutputType is not declaredOutputType:
            if declaredOutputType is VarType.STRING:
                raise TYPE_MUST_BE_STRING()
            if declaredOutputType is VarType.BOOL:
                raise TYPE_MUST_BE_BOOLEAN()
            if declaredOutputType is VarType.FLOAT or VarType.INT:
                raise TYPE_MUST_BE_NUMERIC()
            raise INVALID_RETURN_TYPE()
        return self.visitChildren(ctx)