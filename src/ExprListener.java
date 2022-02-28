// Generated from D:/University Of Essex/CE305-6-Languages and Compilers/Expression1/src\Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExprParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#outstatement}.
	 * @param ctx the parse tree
	 */
	void enterOutstatement(ExprParser.OutstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#outstatement}.
	 * @param ctx the parse tree
	 */
	void exitOutstatement(ExprParser.OutstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignstatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignstatement(ExprParser.AssignstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignstatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignstatement(ExprParser.AssignstatementContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ExprParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ExprParser.IdentifierContext ctx);
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