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
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(ExprParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#makestate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakestate(ExprParser.MakestateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assignstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstate(ExprParser.AssignstateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#outstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutstate(ExprParser.OutstateContext ctx);
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
	 * Visit a parse tree produced by {@link ExprParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExprParser.IdContext ctx);
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