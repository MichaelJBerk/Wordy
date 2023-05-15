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

    def __init__(self, *args, **kwargs):
        self.symtable = SymTableStack()
        super().__init__(*args, **kwargs)

    def visitProgram(self, ctx:WordyParser.ProgramContext):
        return self.visitChildren(ctx)

    def visitExpression(self, ctx:WordyParser.ExpressionContext):
        type = VarType.NONE
        if ctx.funcCall() is not None:
            funcId = ctx.funcCall().IDENTIFIER().getText()
            entryInfo = self.symtable.lookup(funcId)
            if entryInfo is None:
                # TODO: Raise error
                pass
            routineInfo = entryInfo.value
            type = routineInfo.outputType
        elif ctx.stringTerm() is not None and len(ctx.stringTerm()) > 0:
            type = VarType.STRING
        elif ctx.numExpression() is not None and len(ctx.numExpression()) > 0:
            type = VarType.FLOAT
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
            varType = VarType.THING_VAL
        elif ctx.propCall():
            self.visit(ctx.propCall())
            varType = ctx.propCall().type
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
            #TODO: raise error
            pass
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
                raise ERROR_UNDECLARED_ID
            else:
                return None
        else:
            return entry

    def visitDefThing(self, ctx: WordyParser.DefThingContext):
        thingName = ctx.IDENTIFIER().getText()
        currentEntry = self.symtable.lookup(thingName)
        #TODO: If in method, raise error
        #If already exists, throw error
        if currentEntry is not None:
            #TODO: Test this
            raise ERROR_REDECLARED_ID()
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
                raise ERROR_REDECLARED_ID()

            self.visit(assign.varValue())
            propValue = assign.varValue()
            propEntry = symTable.enter(propId, kind)
            propEntry.value = propValue
            propEntry.varType = propValue.type
        entry = self.symtable.enterLocal(thingName, Kind.TYPE)
        entry.value = symTable
        entry.varType = VarType.THING_DEF

    def visitAssignVar(self, ctx:WordyParser.AssignVarContext):
        variable = ctx.variable().IDENTIFIER().getText()
        varValue = ctx.varValue()
        self.assignVar(variable, varValue)
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
                raise ERROR_REDECLARED_ID()
            entryValue = currentEntry.value
            if varValue is not None:
                self.visit(varValue)
                self.visit(entryValue)
                lType: VarType = entryValue.type
                rType: VarType = varValue.type
                if rType is not lType:
                    raise ERROR_INCOMPATIBLE_ASSIGNMENT()

        value = varValue
        if varValue.newThing() is not None:
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
                raise ERROR_UNDECLARED_ID()
            else:
                if entry.value is not None:
                    return self.visit(entry.value)
                else:
                    return None


    def visitVariableFactor(self, ctx:WordyParser.VariableFactorContext):
        variable = ctx.variable().IDENTIFIER().getText()
        entry = self.symtable.lookup(variable)
        if entry is None:
            raise ERROR_UNDECLARED_ID()
        return entry.value

    def visitDefFunc(self, ctx:WordyParser.DefFuncContext):
        #TODO: visit parameter defs
        #TODO: add subroutines
        #TODO: Prevent defining routines within routines
        funcId = ctx.IDENTIFIER().getText()
        currentEntry = self.symtable.lookup(funcId)
        if currentEntry is not None:
            raise ERROR_REDECLARED_ID()
        info = RoutineInfo()
        info.context = ctx
        outputTypeStr = ctx.TYPE().getText().lower()
        outputType: VarType = VarType.NONE
        match outputTypeStr:
            case 'string':
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
        return self.visitChildren(ctx)

    def visitFuncCall(self, ctx:WordyParser.FuncCallContext):
        identifier = ctx.IDENTIFIER().getText()
        entry = self.symtable.lookup(identifier)
        if entry is None:
            raise ERROR_NAME_MUST_BE_PROCEDURE()
        value:RoutineInfo = entry.value
        if len(value.args) is not len(ctx.funcCallArg()):
            raise ERROR_ARGUMENT_COUNT_MISMATCH()
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
        self.assignVar(variable, None)
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
                raise ERROR_TYPE_MUST_BE_STRING()
            if declaredOutputType is VarType.BOOL:
                raise ERRROR_TYPE_MUST_BE_BOOLEAN()
            if declaredOutputType is VarType.FLOAT or VarType.INT:
                raise ERROR_TYPE_MUST_BE_NUMERIC()
            raise ERROR_INVALID_RETURN_TYPE()
        return self.visitChildren(ctx)


    #TODO: Classes/"Thing"s
        #TODO: Assign to thing property
        #TODO: visit lookup thing property
        #just a variable named "id"."prop"
        #lookup value for thing id, then get props
        #TODO: Invalid Field