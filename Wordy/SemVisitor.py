import VarType
from WordyVisitor import WordyVisitor
from WordyParser import WordyParser
from SymTableStuff.SymTable import *
from SymTableStuff.SymTableEntry import *
from WordyErrors import *
from SymTableStuff.RoutineInfo import *
from VarType import *
class SemVisitor(WordyVisitor):
    # TODO: How to handle floats

    # runtime stack contains stack frames
    # Stack frames contain sym table entries
    runtimeStack: []
    symtable = SymTable(0)

    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)

    def visitProgram(self, ctx:WordyParser.ProgramContext):
        return self.visitChildren(ctx)

    def visitExpression(self, ctx:WordyParser.ExpressionContext):
        type = VarType.NONE
        if ctx.funcCall() is not None:
            funcId = ctx.funcCall().IDENTIFIER(0).getText()
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
        type: VarType = VarType.NONE
        if ctx.number() is not None:
            type = VarType.FLOAT
        elif ctx.expression() is not None:
            self.visit(ctx.expression())
            type = ctx.expression().type
        elif ctx.stringTerm() is not None:
            type = VarType.STRING
        elif ctx.bool_() is not None:
            type = VarType.BOOL
        elif ctx.array() is not None:
            #TODO: Add Array
            pass
        elif ctx.arrayQuery() is not None:
            #TODO: Add Array Query
            pass
        elif ctx.INPUT() is not None:
            type = VarType.STRING_ARRAY
        ctx.type = type
        return self.visitChildren(ctx)


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
                lType: VarType = varValue.type
                rType: VarType = entryValue.type
                if lType is not rType:
                    raise ERROR_INCOMPATIBLE_ASSIGNMENT()

        value = varValue
        if isConstant:
            kind = Kind.CONSTANT
        else:
            kind = Kind.VARIABLE
        entry = self.symtable.enter(variable, kind)
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
        entry = self.symtable.enter(funcId, info)
        entry.value = info
        return self.visitChildren(ctx)

    def visitFuncCall(self, ctx:WordyParser.FuncCallContext):
        identifier = ctx.IDENTIFIER(0).getText()
        entry = self.symtable.lookup(identifier)
        if entry is None:
            raise ERROR_NAME_MUST_BE_PROCEDURE()
        self.visitChildren(ctx)



    def visitLoopEachStmt(self, ctx:WordyParser.LoopEachStmtContext):
        variable = ctx.IDENTIFIER(0).getText()
        self.assignVar(variable, None)
        return self.visit(ctx.curlyStatementList())

    def visitOutputStmt(self, ctx:WordyParser.OutputStmtContext):
        funcId = ctx.parentCtx.IDENTIFIER().getText()
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
            raise ERROR_INVALID_RETURN_TYPE()
        return self.visitChildren(ctx)

    #TODO: Classes/"Thing"s
        #TODO: Invalid Field
    #TODO: Arg count mismatch
    #TODO: Invalid return type
    #TODO: Figure out how to handle stack

