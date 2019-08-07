// A visitor for contextual analysis of C.

package C;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import 	C.CParser;
import C.CParser.ActualContext;
import C.CParser.ArithExpressionContext;
import C.CParser.Assn_stmtContext;
import C.CParser.BlockItemListContext;
import C.CParser.Char_valueContext;
import C.CParser.Compound_stmtContext;
import C.CParser.ExpressionContext;
import C.CParser.ExternalDeclarationContext;
import C.CParser.Func_callContext;
import C.CParser.Func_stmtContext;
import C.CParser.FunccallContext;
import C.CParser.IdContext;
import C.CParser.NumContext;
import C.CParser.ParameterContext;
import C.CParser.ParameterlistContext;
import C.CParser.ParensContext;

import org.antlr.v4.runtime.misc.*;

import java.util.ArrayList;
import java.util.List;

//import C.*;
import C.Type;

public class CCheckerVisitor extends AbstractParseTreeVisitor<Type> implements CVisitor<Type> {

	// Contextual errors

	private int errorCount = 0;

	private CommonTokenStream tokens;

	public CCheckerVisitor(CommonTokenStream toks) {
	    tokens = toks;
	}

	private void reportError (String message,
	                          ParserRuleContext ctx) {
	    Interval interval = ctx.getSourceInterval();
	    Token start = tokens.get(interval.a);
	    Token finish = tokens.get(interval.b);
	    int startLine = start.getLine();
	    int startCol = start.getCharPositionInLine();
	    int finishLine = finish.getLine();
	    int finishCol = finish.getCharPositionInLine();
	    System.err.println(startLine + ":" + startCol + "-" +
                               finishLine + ":" + finishCol
		   + " " + message);
		errorCount++;
	}

	public int getNumberOfContextualErrors () {
		return errorCount;
	}

	/*
	Scope checking
	 */
	
	private SymbolTable<Type> typeTable =
	   new SymbolTable<Type>();

	private void predefine () {
		typeTable.put("scanf",
		   new Type.Mapping(Type.SEQUENCE, Type.INT));
		typeTable.put("printf",
		   new Type.Mapping(Type.SEQUENCE,Type.EMPTY));
	}

	private void define (String id, Type type,
	                     ParserRuleContext decl) {
		boolean ok = typeTable.put(id, type);
		if (!ok)
			reportError(id + " is redeclared", decl);
	}

	private Type retrieve (String id, ParserRuleContext occ) {
		Type type = typeTable.get(id);
		if (type == null) {
			reportError(id + " is undeclared", occ);
			return Type.ERROR;
		} else
			return type;
	}
	
	/*
	 Type checking
	 */
	
	private static final Type.Mapping
	   COMPTYPE = new Type.Mapping(
	      new Type.Pair(Type.INT, Type.INT), Type._BOOL),
	   ARITHTYPE = new Type.Mapping(
	      new Type.Pair(Type.INT, Type.INT), Type.INT);

	private void checkType (Type typeExpected,
	                        Type typeActual,
	                        ParserRuleContext construct) {
		if (! typeActual.equiv(typeExpected))
			reportError("type is " + typeActual
			   + ", should be " + typeExpected,
			   construct);
	}

	private Type checkCall (String id, Type typeArg,
	                        ParserRuleContext call) {
		Type typeFunc = retrieve(id, call);
		if (! (typeFunc instanceof Type.Mapping)) {
			reportError(id + " is not a function", call);
			return Type.ERROR;
		} else {
			Type.Mapping mapping = (Type.Mapping)typeFunc;
			if(mapping.domain != null)
				checkType(mapping.domain, typeArg, call);
			return mapping.range;
		}
	}
	
	private Type checkBinary (Type.Mapping typeOp,
	                          Type typeArg1, Type typeArg2,
	                          ParserRuleContext op) { //check binary operator
		if (! (typeOp.domain instanceof Type.Pair))
			reportError(
			   "binary operator should have 2 operands",
			   op);
		else {
			Type.Pair pair =
			   (Type.Pair)typeOp.domain;
			checkType(pair.first, typeArg1, op);
			checkType(pair.second, typeArg2, op);
		}
		return typeOp.range;
	}

///////////////////////////////////////////////////////////////////////////////////
	
	public Type visitWhile_stmt(CParser.While_stmtContext ctx) {			//while-stmt
		System.out.println("get into WHILE loop");
	    Type t = visit(ctx.expression());
	    if(t == Type.INT)
	    	t = Type._BOOL;
	    visit(ctx.statement());
	    checkType(Type._BOOL, t, ctx);
	    System.out.println("exit WHILE loop");
	    return null;
	}
	
	public Type visitIf_stmt(CParser.If_stmtContext ctx) {					//if-stmt
		System.out.println("get into IF-ELSE");
	    Type t = visit(ctx.expression());
	    if(t == Type.INT)
	    	t = Type._BOOL;
	    visit(ctx.c1);
	    if (ctx.c2 != null)
		visit(ctx.c2);
	    checkType(Type._BOOL, t, ctx);
	    System.out.println("exit IF-ELSE");
	    return null;
	}

	public Type visitExpr_stmt(CParser.Expr_stmtContext ctx) {				//expr-stmt
		visitChildren(ctx);
	    return null;
	}
	
	public Type visitVoid(CParser.VoidContext ctx) {						//Void
		return Type.VOID;
	}
		
	public Type visitChar(CParser.CharContext ctx) {						//Char
		return Type.CHAR;
	}
	
	public Type visitInt(CParser.IntContext ctx) {							//Int
		return Type.INT;
	}
	
	public Type visitBool(CParser.BoolContext ctx) {						//_Bool
		return Type._BOOL;
	}
	
	public Type visitVar_del(CParser.Var_delContext ctx) {					//Var_del
		Type t = visit(ctx.typeSpecifier());
		Type t1;
		Type t2;
		if(ctx.c1 != null) {
			
			if(t == Type._BOOL && (ctx.c1.getText().equals("0") | ctx.c1.getText().equals("1")))
				t1 = Type._BOOL;
			else
				t1 = visit(ctx.c1);
			checkType(t, t1, ctx);
		}
			
		if(ctx.c2 != null) {
			
			if(t == Type._BOOL && (ctx.c2.getText().equals("0") | ctx.c2.getText().equals("1")))
				t2 = Type._BOOL;
			else
				t2 = visit(ctx.c2);
			checkType(t, t2, ctx);
		}
	
		if(ctx.id1 != null)
			define(ctx.id1.getText(), t, ctx);
		else
			define(ctx.id2.getText(), t, ctx);
		if(ctx.id3 != null)
			define(ctx.id3.getText(), t, ctx);
		if(ctx.id4 != null)
			define(ctx.id4.getText(), t, ctx);
		return null;		
	}
	
	public Type visitVoid_func(CParser.Void_funcContext ctx) {				//Void_func
		typeTable.enterLocalScope();
		
		Type t = visit(ctx.c1);		// expected return type
		checkType(t, Type.VOID, ctx);	//check whether return type is void
		
		Type t1 ;
		CParser.ParameterlistContext pl = ctx.parameterlist();
		
		if(pl != null) {
			t1 = visit(pl);	//parameter type
		}
		else
			t1 = Type.EMPTY;//no parameters
		
		Type functype = new Type.Mapping(t1, t);
	    define(ctx.id1.getText(), functype, ctx);// put function type  into type table
	    
	    List<CParser.BlockItemListContext> bitem_list = ctx.blockItemList();
	    for (CParser.BlockItemListContext bi : bitem_list)
		visit(bi);
	    
		typeTable.exitLocalScope();
		define(ctx.id1.getText(), functype, ctx);
		System.out.println("void function " + ctx.id1.getText() + " is DEFINED.");
		return null;
	}
	
	public Type visitNotvoid_func(CParser.Notvoid_funcContext ctx) {		//Notvoid_func
		typeTable.enterLocalScope();
		
		Type t = visit(ctx.c2);		// expected return type
		Type t2 ;
		CParser.ParameterlistContext pl = ctx.parameterlist();
		if(pl != null) {
			t2 = visit(pl);	// parameter type
		}
		else
			t2 = Type.EMPTY;
		
		Type functype = new Type.Mapping(t2, t);
	    define(ctx.id2.getText(), functype, ctx);	// put function type into type table
	    
	    List<CParser.BlockItemListContext> bitem_list = ctx.blockItemList();
	    for (CParser.BlockItemListContext bi : bitem_list)
		visit(bi);
	    
	    Type t1;
		CParser.ExpressionContext ae = ctx.expression();	// actual return type
		if(ae != null)
			t1 = visit(ae); 
		else
			t1 = Type.VOID;
		checkType(t1, t, ctx);	//check expected and actual return type
	    
		typeTable.exitLocalScope();
		define(ctx.id2.getText(), functype, ctx);
		System.out.println("non-void function " + ctx.id2.getText() + "is DEFINED.");
		return null;
		
	}

	@Override
	public Type visitExternalDeclaration(ExternalDeclarationContext ctx) {	//externalDeclaration
		predefine();
		visitChildren(ctx);
	    return null;
	}

	@Override
	public Type visitBlockItemList(BlockItemListContext ctx) {				//blockitmlist
		visitChildren(ctx);
	    return null;
	}

	@Override
	public Type visitCompound_stmt(Compound_stmtContext ctx) {				//compound_stmt
		visitChildren(ctx);
	    return null;
	}

	@Override
	public Type visitFunccall(FunccallContext ctx) {						//funccall
		Type t;
		Type t1;
		if(ctx.actual() != null)
			t = visit(ctx.actual());
		else
			t = Type.EMPTY;
		t1 = checkCall(ctx.Identifier().getText(), t, ctx);
		System.out.println("Function " + ctx.Identifier().getText() + "is CALLED.");
	    return t1;
	}

	@Override
	public Type visitParameterlist(ParameterlistContext ctx) {				//parameterlist
		List<ParameterContext> para_del = ctx.parameter();
		ArrayList<Type> array = new ArrayList<Type>();
		Type t;
		Type seqtype ;
		if (para_del != null) {
			for (CParser.ParameterContext fd : para_del) {
				t = visit(fd);
				array.add(t);
			}				
			seqtype = new Type.Sequence(array);}
		else
			seqtype = Type.EMPTY;
	    
	    return seqtype;
	}


	@Override
	public Type visitActual(ActualContext ctx) {							//actual
		List<ExpressionContext> exp = ctx.expression();
		ArrayList<Type> array = new ArrayList<Type>();
		Type t;
		Type seqtype ;
		if (exp != null) {
			for (CParser.ExpressionContext e : exp) {
				t = visit(e);
				array.add(t);
			}				
			seqtype = new Type.Sequence(array);}
		else
			seqtype = Type.EMPTY;
	    
	    return seqtype;
	}

	@Override
	public Type visitExpression(ExpressionContext ctx) {					//Expression
		Type t1;
		t1 = visit(ctx.e1);
		    if (ctx.e2 != null) {
				Type t2 = visit(ctx.e2);
				return checkBinary(COMPTYPE, t1, t2, ctx);
		    }
		    else {
		    	return t1;
		    }
	}

	@Override
	public Type visitArithExpression(ArithExpressionContext ctx) {			//arithExpression
		Type t1;
		t1 = visit(ctx.e1);
		    if (ctx.e2 != null) {
				Type t2 = visit(ctx.e2);
				return checkBinary(ARITHTYPE, t1, t2, ctx);
		    }
		    else {
		    	return t1;
		    }
	}

	@Override
	public Type visitNum(NumContext ctx) {									//num
		return Type.INT;
	}

	@Override
	public Type visitId(IdContext ctx) {									//id
		return retrieve(ctx.Identifier().getText(), ctx);
	}

	@Override
	public Type visitParens(ParensContext ctx) {							//parens
		return visit(ctx.expression());
	}

	@Override
	public Type visitFunc_call(Func_callContext ctx) {						//func_call
		Type t;
		Type t1;
		if(ctx.actual() != null)
			t = visit(ctx.actual());
		else
			t = Type.EMPTY;
		t1 = checkCall(ctx.Identifier().getText(), t, ctx);
		System.out.println("Function " + ctx.Identifier().getText() + "is CALLED.");
	    return t1;
	}

	@Override
	public Type visitParameter(ParameterContext ctx) {						//parameter
		CParser.TypeSpecifierContext tc = ctx.typeSpecifier();
	    Type t;
		t = visit(tc);
		define(ctx.Identifier().getText(), t, ctx);	  
	    return t;
	}

	@Override
	public Type visitAssn_stmt(Assn_stmtContext ctx) {						//assgn_stmt
		Type tvar = retrieve(ctx.Identifier().getText(), ctx);
	    Type t = visit(ctx.expression());
	    checkType(tvar, t, ctx);
	    return null;
	}

	@Override
	public Type visitChar_value(Char_valueContext ctx) {					//char_value
		return Type.CHAR;
	}

	@Override
	public Type visitFunc_stmt(Func_stmtContext ctx) {
		visit(ctx.funccall());
		return null;
	}
}
