// Generated from /Users/michaelberk/Documents/CS Work/Wordy/Wordy/Wordy.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WordyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WordyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WordyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WordyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(WordyParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#varValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarValue(WordyParser.VarValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#assignVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(WordyParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#assignVarConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVarConst(WordyParser.AssignVarConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(WordyParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#arrayQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayQuery(WordyParser.ArrayQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#castNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastNum(WordyParser.CastNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#arrayTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTerm(WordyParser.ArrayTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(WordyParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#stringTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTerm(WordyParser.StringTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#numTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumTerm(WordyParser.NumTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#sayStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSayStmt(WordyParser.SayStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#outputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStmt(WordyParser.OutputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#defThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefThing(WordyParser.DefThingContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#defParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefParam(WordyParser.DefParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#defFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunc(WordyParser.DefFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(WordyParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#relOpExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOpExpr(WordyParser.RelOpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(WordyParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#curlyStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurlyStatementList(WordyParser.CurlyStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#loopEachStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopEachStmt(WordyParser.LoopEachStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#loopUntilStment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopUntilStment(WordyParser.LoopUntilStmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#loopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmt(WordyParser.LoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(WordyParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WordyParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#boolConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(WordyParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(WordyParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#characterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(WordyParser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(WordyParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(WordyParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(WordyParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(WordyParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(WordyParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#realConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConstant(WordyParser.RealConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(WordyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpression(WordyParser.NumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFactor(WordyParser.VariableFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(WordyParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterFactor(WordyParser.CharacterFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(WordyParser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactor(WordyParser.NotFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link WordyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(WordyParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(WordyParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(WordyParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#eqlOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqlOp(WordyParser.EqlOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#neqOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqOp(WordyParser.NeqOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#ltOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtOp(WordyParser.LtOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#gtOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtOp(WordyParser.GtOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#leqOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeqOp(WordyParser.LeqOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#geqOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeqOp(WordyParser.GeqOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(WordyParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(WordyParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordyParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(WordyParser.MulOpContext ctx);
}