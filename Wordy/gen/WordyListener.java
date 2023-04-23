// Generated from /Users/michaelberk/Documents/CS Work/Wordy/Wordy/Wordy.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WordyParser}.
 */
public interface WordyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WordyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WordyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WordyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(WordyParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(WordyParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#varValue}.
	 * @param ctx the parse tree
	 */
	void enterVarValue(WordyParser.VarValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#varValue}.
	 * @param ctx the parse tree
	 */
	void exitVarValue(WordyParser.VarValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(WordyParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(WordyParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#assignVarConst}.
	 * @param ctx the parse tree
	 */
	void enterAssignVarConst(WordyParser.AssignVarConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#assignVarConst}.
	 * @param ctx the parse tree
	 */
	void exitAssignVarConst(WordyParser.AssignVarConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(WordyParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(WordyParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#arrayQuery}.
	 * @param ctx the parse tree
	 */
	void enterArrayQuery(WordyParser.ArrayQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#arrayQuery}.
	 * @param ctx the parse tree
	 */
	void exitArrayQuery(WordyParser.ArrayQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#castNum}.
	 * @param ctx the parse tree
	 */
	void enterCastNum(WordyParser.CastNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#castNum}.
	 * @param ctx the parse tree
	 */
	void exitCastNum(WordyParser.CastNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#arrayTerm}.
	 * @param ctx the parse tree
	 */
	void enterArrayTerm(WordyParser.ArrayTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#arrayTerm}.
	 * @param ctx the parse tree
	 */
	void exitArrayTerm(WordyParser.ArrayTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(WordyParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(WordyParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#stringTerm}.
	 * @param ctx the parse tree
	 */
	void enterStringTerm(WordyParser.StringTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#stringTerm}.
	 * @param ctx the parse tree
	 */
	void exitStringTerm(WordyParser.StringTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#numTerm}.
	 * @param ctx the parse tree
	 */
	void enterNumTerm(WordyParser.NumTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#numTerm}.
	 * @param ctx the parse tree
	 */
	void exitNumTerm(WordyParser.NumTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#sayStmt}.
	 * @param ctx the parse tree
	 */
	void enterSayStmt(WordyParser.SayStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#sayStmt}.
	 * @param ctx the parse tree
	 */
	void exitSayStmt(WordyParser.SayStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#outputStmt}.
	 * @param ctx the parse tree
	 */
	void enterOutputStmt(WordyParser.OutputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#outputStmt}.
	 * @param ctx the parse tree
	 */
	void exitOutputStmt(WordyParser.OutputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#defThing}.
	 * @param ctx the parse tree
	 */
	void enterDefThing(WordyParser.DefThingContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#defThing}.
	 * @param ctx the parse tree
	 */
	void exitDefThing(WordyParser.DefThingContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#defParam}.
	 * @param ctx the parse tree
	 */
	void enterDefParam(WordyParser.DefParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#defParam}.
	 * @param ctx the parse tree
	 */
	void exitDefParam(WordyParser.DefParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#defFunc}.
	 * @param ctx the parse tree
	 */
	void enterDefFunc(WordyParser.DefFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#defFunc}.
	 * @param ctx the parse tree
	 */
	void exitDefFunc(WordyParser.DefFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(WordyParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(WordyParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#relOpExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelOpExpr(WordyParser.RelOpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#relOpExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelOpExpr(WordyParser.RelOpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(WordyParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(WordyParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#curlyStatementList}.
	 * @param ctx the parse tree
	 */
	void enterCurlyStatementList(WordyParser.CurlyStatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#curlyStatementList}.
	 * @param ctx the parse tree
	 */
	void exitCurlyStatementList(WordyParser.CurlyStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#loopEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopEachStmt(WordyParser.LoopEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#loopEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopEachStmt(WordyParser.LoopEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#loopUntilStment}.
	 * @param ctx the parse tree
	 */
	void enterLoopUntilStment(WordyParser.LoopUntilStmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#loopUntilStment}.
	 * @param ctx the parse tree
	 */
	void exitLoopUntilStment(WordyParser.LoopUntilStmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(WordyParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(WordyParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(WordyParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(WordyParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WordyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WordyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(WordyParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(WordyParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(WordyParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(WordyParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(WordyParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(WordyParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(WordyParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(WordyParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(WordyParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(WordyParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(WordyParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(WordyParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(WordyParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(WordyParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(WordyParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(WordyParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(WordyParser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(WordyParser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WordyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WordyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpression(WordyParser.NumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpression(WordyParser.NumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableFactor(WordyParser.VariableFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableFactor(WordyParser.VariableFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(WordyParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(WordyParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharacterFactor(WordyParser.CharacterFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharacterFactor(WordyParser.CharacterFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(WordyParser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(WordyParser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotFactor(WordyParser.NotFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotFactor(WordyParser.NotFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(WordyParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(WordyParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcat(WordyParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcat(WordyParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(WordyParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(WordyParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#eqlOp}.
	 * @param ctx the parse tree
	 */
	void enterEqlOp(WordyParser.EqlOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#eqlOp}.
	 * @param ctx the parse tree
	 */
	void exitEqlOp(WordyParser.EqlOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#neqOp}.
	 * @param ctx the parse tree
	 */
	void enterNeqOp(WordyParser.NeqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#neqOp}.
	 * @param ctx the parse tree
	 */
	void exitNeqOp(WordyParser.NeqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#ltOp}.
	 * @param ctx the parse tree
	 */
	void enterLtOp(WordyParser.LtOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#ltOp}.
	 * @param ctx the parse tree
	 */
	void exitLtOp(WordyParser.LtOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#gtOp}.
	 * @param ctx the parse tree
	 */
	void enterGtOp(WordyParser.GtOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#gtOp}.
	 * @param ctx the parse tree
	 */
	void exitGtOp(WordyParser.GtOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#leqOp}.
	 * @param ctx the parse tree
	 */
	void enterLeqOp(WordyParser.LeqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#leqOp}.
	 * @param ctx the parse tree
	 */
	void exitLeqOp(WordyParser.LeqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#geqOp}.
	 * @param ctx the parse tree
	 */
	void enterGeqOp(WordyParser.GeqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#geqOp}.
	 * @param ctx the parse tree
	 */
	void exitGeqOp(WordyParser.GeqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(WordyParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(WordyParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(WordyParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(WordyParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordyParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(WordyParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordyParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(WordyParser.MulOpContext ctx);
}