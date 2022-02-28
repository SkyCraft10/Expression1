// Generated from D:/University Of Essex/CE305-6-Languages and Compilers/Expression1/src\Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(ExprParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ExprParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#outstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutstatement(ExprParser.OutstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assignstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstatement(ExprParser.AssignstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExprParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ExprParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ExprParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#floatnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatnum(ExprParser.FloatnumContext ctx);
}