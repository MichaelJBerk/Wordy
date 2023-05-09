from WordyVisitor import WordyVisitor
from WordyParser import WordyParser
from SymTableStuff.SymTable import *
from SymTableStuff.SymTableEntry import *
from WordyErrors import *
class SemVisitor(WordyVisitor):

    # runtime stack contains stack frames
    # Stack frames contain sym table entries
    runtimeStack: []
    symtable = SymTable(0)

    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)

    def visitProgram(self, ctx:WordyParser.ProgramContext):
        return self.visitChildren(ctx)

    def visitAssignVar(self, ctx:WordyParser.AssignVarContext):
        variable = ctx.variable().IDENTIFIER().getText()
        currentEntry = self.symtable.lookup(variable)
        if currentEntry is not None:
            if currentEntry.kind is Kind.CONSTANT:
                raise ERROR_REDECLARED_ID()
        value = ctx.varValue()
        entry = self.symtable.enter(variable, Kind.VARIABLE)
        entry.value = value
        return None

    def visitAssignVarConst(self, ctx:WordyParser.AssignVarConstContext):
        variable = ctx.variable().IDENTIFIER().getText()
        currentEntry = self.symtable.lookup(variable)
        if currentEntry is not None:
            if currentEntry.kind is Kind.VARIABLE or Kind.CONSTANT:
                raise ERROR_REDECLARED_ID()
        value = ctx.varValue()
        entry = self.symtable.enter(variable, Kind.CONSTANT)
        entry.value = value
        return None

    def visitStringTerm(self, ctx:WordyParser.StringTermContext):
        if ctx.concat():
            return self.visit(ctx.concat())
        if ctx.stringConstant():
            return self.visit(ctx.stringConstant())
        if ctx.IDENTIFIER():
            entry = self.symtable.lookup(ctx.IDENTIFIER().getText())
            if entry is None:
                raise ERROR_UNDECLARED_ID()
            else:
                return self.visit(entry.value)

    def visitVariableFactor(self, ctx:WordyParser.VariableFactorContext):
        variable = ctx.variable().IDENTIFIER().getText()
        entry = self.symtable.lookup(variable)
        if entry is None:
            raise ERROR_UNDECLARED_ID()
        return entry.value

    def visitFuncCall(self, ctx:WordyParser.FuncCallContext):
        identifier = ctx.IDENTIFIER(0).getText()
        entry = self.symtable.lookup(identifier)
        if entry is None:
            raise ERROR_NAME_MUST_BE_PROCEDURE()
        self.visitChildren(ctx)
