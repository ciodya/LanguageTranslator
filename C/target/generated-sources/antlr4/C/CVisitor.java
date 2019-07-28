// Generated from C.g4 by ANTLR 4.7.2
package C;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(CParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid(CParser.VoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(CParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(CParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_del}
	 * labeled alternative in {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_del(CParser.Var_delContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void_func}
	 * labeled alternative in {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_func(CParser.Void_funcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notvoid_func}
	 * labeled alternative in {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotvoid_func(CParser.Notvoid_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterlist(CParser.ParameterlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(CParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arithExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExpression(CParser.ArithExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(CParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_call}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(CParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char_value}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_value(CParser.Char_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(CParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(CParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(CParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(CParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funccall}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(CParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assn_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssn_stmt(CParser.Assn_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#actual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual(CParser.ActualContext ctx);
}