// Generated from D:/University Of Essex/CE305-6-Languages and Compilers/Expression1/src\Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(ExprParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(ExprParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#makestate}.
	 * @param ctx the parse tree
	 */
	void enterMakestate(ExprParser.MakestateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#makestate}.
	 * @param ctx the parse tree
	 */
	void exitMakestate(ExprParser.MakestateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignstate}.
	 * @param ctx the parse tree
	 */
	void enterAssignstate(ExprParser.AssignstateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignstate}.
	 * @param ctx the parse tree
	 */
	void exitAssignstate(ExprParser.AssignstateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#outstate}.
	 * @param ctx the parse tree
	 */
	void enterOutstate(ExprParser.OutstateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#outstate}.
	 * @param ctx the parse tree
	 */
	void exitOutstate(ExprParser.OutstateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExprParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExprParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ExprParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ExprParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#floatnum}.
	 * @param ctx the parse tree
	 */
	void enterFloatnum(ExprParser.FloatnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#floatnum}.
	 * @param ctx the parse tree
	 */
	void exitFloatnum(ExprParser.FloatnumContext ctx);
}