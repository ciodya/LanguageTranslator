// Generated from C.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(CParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(CParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterVoid(CParser.VoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitVoid(CParser.VoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterChar(CParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitChar(CParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInt(CParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInt(CParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBool(CParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBool(CParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(CParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(CParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_del}
	 * labeled alternative in {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVar_del(CParser.Var_delContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_del}
	 * labeled alternative in {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVar_del(CParser.Var_delContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void_func}
	 * labeled alternative in {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVoid_func(CParser.Void_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void_func}
	 * labeled alternative in {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVoid_func(CParser.Void_funcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notvoid_func}
	 * labeled alternative in {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNotvoid_func(CParser.Notvoid_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notvoid_func}
	 * labeled alternative in {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNotvoid_func(CParser.Notvoid_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterlist(CParser.ParameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterlist(CParser.ParameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(CParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(CParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expression_suffix}.
	 * @param ctx the parse tree
	 */
	void enterExpression_suffix(CParser.Expression_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression_suffix}.
	 * @param ctx the parse tree
	 */
	void exitExpression_suffix(CParser.Expression_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arithExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithExpression(CParser.ArithExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arithExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithExpression(CParser.ArithExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arithExpression_suffix}.
	 * @param ctx the parse tree
	 */
	void enterArithExpression_suffix(CParser.ArithExpression_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arithExpression_suffix}.
	 * @param ctx the parse tree
	 */
	void exitArithExpression_suffix(CParser.ArithExpression_suffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterNum(CParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitNum(CParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterId(CParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitId(CParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterParens(CParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitParens(CParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_call}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(CParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_call}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(CParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char_value}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterChar_value(CParser.Char_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char_value}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitChar_value(CParser.Char_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char_array}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterChar_array(CParser.Char_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char_array}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitChar_array(CParser.Char_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(CParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(CParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(CParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(CParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(CParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(CParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(CParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(CParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunc_stmt(CParser.Func_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunc_stmt(CParser.Func_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assn_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssn_stmt(CParser.Assn_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assn_stmt}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssn_stmt(CParser.Assn_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#actual}.
	 * @param ctx the parse tree
	 */
	void enterActual(CParser.ActualContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#actual}.
	 * @param ctx the parse tree
	 */
	void exitActual(CParser.ActualContext ctx);
}