# Generated from Wordy.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .WordyParser import WordyParser
else:
    from WordyParser import WordyParser

# This class defines a complete generic visitor for a parse tree produced by WordyParser.

class WordyVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by WordyParser#program.
    def visitProgram(self, ctx:WordyParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#varValue.
    def visitVarValue(self, ctx:WordyParser.VarValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#assignVar.
    def visitAssignVar(self, ctx:WordyParser.AssignVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#assignVarConst.
    def visitAssignVarConst(self, ctx:WordyParser.AssignVarConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#assignStmt.
    def visitAssignStmt(self, ctx:WordyParser.AssignStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#arrayQuery.
    def visitArrayQuery(self, ctx:WordyParser.ArrayQueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#castNum.
    def visitCastNum(self, ctx:WordyParser.CastNumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#arrayTerm.
    def visitArrayTerm(self, ctx:WordyParser.ArrayTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#array.
    def visitArray(self, ctx:WordyParser.ArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#stringTerm.
    def visitStringTerm(self, ctx:WordyParser.StringTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#numTerm.
    def visitNumTerm(self, ctx:WordyParser.NumTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#sayStmt.
    def visitSayStmt(self, ctx:WordyParser.SayStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#outputStmt.
    def visitOutputStmt(self, ctx:WordyParser.OutputStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#defThing.
    def visitDefThing(self, ctx:WordyParser.DefThingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#defParam.
    def visitDefParam(self, ctx:WordyParser.DefParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#funcBody.
    def visitFuncBody(self, ctx:WordyParser.FuncBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#defFunc.
    def visitDefFunc(self, ctx:WordyParser.DefFuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#funcCallArg.
    def visitFuncCallArg(self, ctx:WordyParser.FuncCallArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#funcCall.
    def visitFuncCall(self, ctx:WordyParser.FuncCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#propCall.
    def visitPropCall(self, ctx:WordyParser.PropCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#relOpExpr.
    def visitRelOpExpr(self, ctx:WordyParser.RelOpExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#ifStmt.
    def visitIfStmt(self, ctx:WordyParser.IfStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#curlyStatementList.
    def visitCurlyStatementList(self, ctx:WordyParser.CurlyStatementListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#loopEachStmt.
    def visitLoopEachStmt(self, ctx:WordyParser.LoopEachStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#loopUntilStment.
    def visitLoopUntilStment(self, ctx:WordyParser.LoopUntilStmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#loopStmt.
    def visitLoopStmt(self, ctx:WordyParser.LoopStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#statementList.
    def visitStatementList(self, ctx:WordyParser.StatementListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#statement.
    def visitStatement(self, ctx:WordyParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#boolConst.
    def visitBoolConst(self, ctx:WordyParser.BoolConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#bool.
    def visitBool(self, ctx:WordyParser.BoolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#characterConstant.
    def visitCharacterConstant(self, ctx:WordyParser.CharacterConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#stringConstant.
    def visitStringConstant(self, ctx:WordyParser.StringConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#variable.
    def visitVariable(self, ctx:WordyParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#number.
    def visitNumber(self, ctx:WordyParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#unsignedNumber.
    def visitUnsignedNumber(self, ctx:WordyParser.UnsignedNumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#integerConstant.
    def visitIntegerConstant(self, ctx:WordyParser.IntegerConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#realConstant.
    def visitRealConstant(self, ctx:WordyParser.RealConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#expression.
    def visitExpression(self, ctx:WordyParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#numExpression.
    def visitNumExpression(self, ctx:WordyParser.NumExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#variableFactor.
    def visitVariableFactor(self, ctx:WordyParser.VariableFactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#numberFactor.
    def visitNumberFactor(self, ctx:WordyParser.NumberFactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#funcCallFactor.
    def visitFuncCallFactor(self, ctx:WordyParser.FuncCallFactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#notFactor.
    def visitNotFactor(self, ctx:WordyParser.NotFactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#parenthesizedExpression.
    def visitParenthesizedExpression(self, ctx:WordyParser.ParenthesizedExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#concat.
    def visitConcat(self, ctx:WordyParser.ConcatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#sign.
    def visitSign(self, ctx:WordyParser.SignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#eqlOp.
    def visitEqlOp(self, ctx:WordyParser.EqlOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#neqOp.
    def visitNeqOp(self, ctx:WordyParser.NeqOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#ltOp.
    def visitLtOp(self, ctx:WordyParser.LtOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#gtOp.
    def visitGtOp(self, ctx:WordyParser.GtOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#leqOp.
    def visitLeqOp(self, ctx:WordyParser.LeqOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#geqOp.
    def visitGeqOp(self, ctx:WordyParser.GeqOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#relOp.
    def visitRelOp(self, ctx:WordyParser.RelOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#addOp.
    def visitAddOp(self, ctx:WordyParser.AddOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WordyParser#mulOp.
    def visitMulOp(self, ctx:WordyParser.MulOpContext):
        return self.visitChildren(ctx)



del WordyParser