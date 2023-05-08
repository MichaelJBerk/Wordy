from WordyVisitor import WordyVisitor
from WordyParser import WordyParser
from SymTableStuff.SymTable import *
from SymTableStuff.SymTableEntry import *
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

        # variable = ctx.variable()
        # value = ctx.varValue()
        # # symtable.lookup()
        # if variable in self.runtimeStack:
        #     stackVal = self.runtimeStack[variable]
        #     if stackVal.kind is Kind.CONSTANT:
        #         raise ValueError("Redeclared identifier")
        return self.visitChildren(ctx)


    def visitAssignVarConst(self, ctx:WordyParser.AssignVarConstContext):
        return self.visitChildren(ctx)
    #
    #     variable = ctx.variable()
    #     value = ctx.varValue()


    # def visitAssignStmt(self, ctx:WordyParser.AssignStmtContext):
        # ctx.variable
    # def visitAssignVarConst(self, ctx:WordyParser.AssignVarConstContext):
