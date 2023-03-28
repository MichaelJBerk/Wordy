# Generated from Wordy.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .WordyParser import WordyParser
else:
    from WordyParser import WordyParser

# This class defines a complete listener for a parse tree produced by WordyParser.
class WordyListener(ParseTreeListener):

    # Enter a parse tree produced by WordyParser#assignString.
    def enterAssignString(self, ctx:WordyParser.AssignStringContext):
        pass

    # Exit a parse tree produced by WordyParser#assignString.
    def exitAssignString(self, ctx:WordyParser.AssignStringContext):
        pass


    # Enter a parse tree produced by WordyParser#assignNum.
    def enterAssignNum(self, ctx:WordyParser.AssignNumContext):
        pass

    # Exit a parse tree produced by WordyParser#assignNum.
    def exitAssignNum(self, ctx:WordyParser.AssignNumContext):
        pass


    # Enter a parse tree produced by WordyParser#comment.
    def enterComment(self, ctx:WordyParser.CommentContext):
        pass

    # Exit a parse tree produced by WordyParser#comment.
    def exitComment(self, ctx:WordyParser.CommentContext):
        pass


    # Enter a parse tree produced by WordyParser#stringTerm.
    def enterStringTerm(self, ctx:WordyParser.StringTermContext):
        pass

    # Exit a parse tree produced by WordyParser#stringTerm.
    def exitStringTerm(self, ctx:WordyParser.StringTermContext):
        pass


    # Enter a parse tree produced by WordyParser#numTerm.
    def enterNumTerm(self, ctx:WordyParser.NumTermContext):
        pass

    # Exit a parse tree produced by WordyParser#numTerm.
    def exitNumTerm(self, ctx:WordyParser.NumTermContext):
        pass


    # Enter a parse tree produced by WordyParser#characterConstant.
    def enterCharacterConstant(self, ctx:WordyParser.CharacterConstantContext):
        pass

    # Exit a parse tree produced by WordyParser#characterConstant.
    def exitCharacterConstant(self, ctx:WordyParser.CharacterConstantContext):
        pass


    # Enter a parse tree produced by WordyParser#stringConstant.
    def enterStringConstant(self, ctx:WordyParser.StringConstantContext):
        pass

    # Exit a parse tree produced by WordyParser#stringConstant.
    def exitStringConstant(self, ctx:WordyParser.StringConstantContext):
        pass


    # Enter a parse tree produced by WordyParser#variable.
    def enterVariable(self, ctx:WordyParser.VariableContext):
        pass

    # Exit a parse tree produced by WordyParser#variable.
    def exitVariable(self, ctx:WordyParser.VariableContext):
        pass


    # Enter a parse tree produced by WordyParser#number.
    def enterNumber(self, ctx:WordyParser.NumberContext):
        pass

    # Exit a parse tree produced by WordyParser#number.
    def exitNumber(self, ctx:WordyParser.NumberContext):
        pass


    # Enter a parse tree produced by WordyParser#unsignedNumber.
    def enterUnsignedNumber(self, ctx:WordyParser.UnsignedNumberContext):
        pass

    # Exit a parse tree produced by WordyParser#unsignedNumber.
    def exitUnsignedNumber(self, ctx:WordyParser.UnsignedNumberContext):
        pass


    # Enter a parse tree produced by WordyParser#integerConstant.
    def enterIntegerConstant(self, ctx:WordyParser.IntegerConstantContext):
        pass

    # Exit a parse tree produced by WordyParser#integerConstant.
    def exitIntegerConstant(self, ctx:WordyParser.IntegerConstantContext):
        pass


    # Enter a parse tree produced by WordyParser#realConstant.
    def enterRealConstant(self, ctx:WordyParser.RealConstantContext):
        pass

    # Exit a parse tree produced by WordyParser#realConstant.
    def exitRealConstant(self, ctx:WordyParser.RealConstantContext):
        pass


    # Enter a parse tree produced by WordyParser#expression.
    def enterExpression(self, ctx:WordyParser.ExpressionContext):
        pass

    # Exit a parse tree produced by WordyParser#expression.
    def exitExpression(self, ctx:WordyParser.ExpressionContext):
        pass


    # Enter a parse tree produced by WordyParser#baseExpression.
    def enterBaseExpression(self, ctx:WordyParser.BaseExpressionContext):
        pass

    # Exit a parse tree produced by WordyParser#baseExpression.
    def exitBaseExpression(self, ctx:WordyParser.BaseExpressionContext):
        pass


    # Enter a parse tree produced by WordyParser#variableFactor.
    def enterVariableFactor(self, ctx:WordyParser.VariableFactorContext):
        pass

    # Exit a parse tree produced by WordyParser#variableFactor.
    def exitVariableFactor(self, ctx:WordyParser.VariableFactorContext):
        pass


    # Enter a parse tree produced by WordyParser#numberFactor.
    def enterNumberFactor(self, ctx:WordyParser.NumberFactorContext):
        pass

    # Exit a parse tree produced by WordyParser#numberFactor.
    def exitNumberFactor(self, ctx:WordyParser.NumberFactorContext):
        pass


    # Enter a parse tree produced by WordyParser#characterFactor.
    def enterCharacterFactor(self, ctx:WordyParser.CharacterFactorContext):
        pass

    # Exit a parse tree produced by WordyParser#characterFactor.
    def exitCharacterFactor(self, ctx:WordyParser.CharacterFactorContext):
        pass


    # Enter a parse tree produced by WordyParser#stringFactor.
    def enterStringFactor(self, ctx:WordyParser.StringFactorContext):
        pass

    # Exit a parse tree produced by WordyParser#stringFactor.
    def exitStringFactor(self, ctx:WordyParser.StringFactorContext):
        pass


    # Enter a parse tree produced by WordyParser#notFactor.
    def enterNotFactor(self, ctx:WordyParser.NotFactorContext):
        pass

    # Exit a parse tree produced by WordyParser#notFactor.
    def exitNotFactor(self, ctx:WordyParser.NotFactorContext):
        pass


    # Enter a parse tree produced by WordyParser#parenthesizedExpression.
    def enterParenthesizedExpression(self, ctx:WordyParser.ParenthesizedExpressionContext):
        pass

    # Exit a parse tree produced by WordyParser#parenthesizedExpression.
    def exitParenthesizedExpression(self, ctx:WordyParser.ParenthesizedExpressionContext):
        pass


    # Enter a parse tree produced by WordyParser#concat.
    def enterConcat(self, ctx:WordyParser.ConcatContext):
        pass

    # Exit a parse tree produced by WordyParser#concat.
    def exitConcat(self, ctx:WordyParser.ConcatContext):
        pass


    # Enter a parse tree produced by WordyParser#sign.
    def enterSign(self, ctx:WordyParser.SignContext):
        pass

    # Exit a parse tree produced by WordyParser#sign.
    def exitSign(self, ctx:WordyParser.SignContext):
        pass


    # Enter a parse tree produced by WordyParser#eqlOp.
    def enterEqlOp(self, ctx:WordyParser.EqlOpContext):
        pass

    # Exit a parse tree produced by WordyParser#eqlOp.
    def exitEqlOp(self, ctx:WordyParser.EqlOpContext):
        pass


    # Enter a parse tree produced by WordyParser#neqOp.
    def enterNeqOp(self, ctx:WordyParser.NeqOpContext):
        pass

    # Exit a parse tree produced by WordyParser#neqOp.
    def exitNeqOp(self, ctx:WordyParser.NeqOpContext):
        pass


    # Enter a parse tree produced by WordyParser#ltOp.
    def enterLtOp(self, ctx:WordyParser.LtOpContext):
        pass

    # Exit a parse tree produced by WordyParser#ltOp.
    def exitLtOp(self, ctx:WordyParser.LtOpContext):
        pass


    # Enter a parse tree produced by WordyParser#gtOp.
    def enterGtOp(self, ctx:WordyParser.GtOpContext):
        pass

    # Exit a parse tree produced by WordyParser#gtOp.
    def exitGtOp(self, ctx:WordyParser.GtOpContext):
        pass


    # Enter a parse tree produced by WordyParser#leqOp.
    def enterLeqOp(self, ctx:WordyParser.LeqOpContext):
        pass

    # Exit a parse tree produced by WordyParser#leqOp.
    def exitLeqOp(self, ctx:WordyParser.LeqOpContext):
        pass


    # Enter a parse tree produced by WordyParser#geqOp.
    def enterGeqOp(self, ctx:WordyParser.GeqOpContext):
        pass

    # Exit a parse tree produced by WordyParser#geqOp.
    def exitGeqOp(self, ctx:WordyParser.GeqOpContext):
        pass


    # Enter a parse tree produced by WordyParser#relOp.
    def enterRelOp(self, ctx:WordyParser.RelOpContext):
        pass

    # Exit a parse tree produced by WordyParser#relOp.
    def exitRelOp(self, ctx:WordyParser.RelOpContext):
        pass


    # Enter a parse tree produced by WordyParser#addOp.
    def enterAddOp(self, ctx:WordyParser.AddOpContext):
        pass

    # Exit a parse tree produced by WordyParser#addOp.
    def exitAddOp(self, ctx:WordyParser.AddOpContext):
        pass


    # Enter a parse tree produced by WordyParser#mulOp.
    def enterMulOp(self, ctx:WordyParser.MulOpContext):
        pass

    # Exit a parse tree produced by WordyParser#mulOp.
    def exitMulOp(self, ctx:WordyParser.MulOpContext):
        pass



del WordyParser