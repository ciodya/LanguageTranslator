/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * A visitor for contextual analysis of Python.
*/ 

package python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import python.pythonParser.ComparisonContext;
import python.pythonParser.Comparison_suffixContext;
import python.pythonParser.Compound_stmtContext;
import python.pythonParser.ExprContext;
import python.pythonParser.Expr_suffixContext;
import python.pythonParser.FalseContext;
import python.pythonParser.FunccallContext;
import python.pythonParser.FuncdefContext;
import python.pythonParser.FunctionCallContext;
import python.pythonParser.IdContext;
import python.pythonParser.If_stmtContext;
import python.pythonParser.InputContext;
import python.pythonParser.NumContext;
import python.pythonParser.ParameterlistContext;
import python.pythonParser.ParensContext;
import python.pythonParser.Return_stmtContext;
import python.pythonParser.Small_stmtContext;
import python.pythonParser.ParameterContext;
import python.pythonParser.StringContext;
import python.pythonParser.SuiteContext;
import python.pythonParser.TestContext;
import python.pythonParser.TestlistContext;
import python.pythonParser.TrueContext;
import python.pythonParser.While_stmtContext;

public class pythonCheckerVisitor extends AbstractParseTreeVisitor<Type> implements pythonVisitor<Type> {
	private int errorCount = 0;
	private String errors = null;
	private CommonTokenStream tokens;
	private boolean local = false;
	// Constructor
	public pythonCheckerVisitor(CommonTokenStream toks) {
	    tokens = toks;
	}
	//show contextual errors to window
		public String showErrors(){
			return errors;
		}
	//Report positions of errors
	private void reportError (String message,
	                          ParserRuleContext ctx) {
	    Interval interval = ctx.getSourceInterval();
	    Token start = tokens.get(interval.a);
	    Token finish = tokens.get(interval.b);
	    int startLine = start.getLine();
	    int startCol = start.getCharPositionInLine();
	    int finishLine = finish.getLine();
	    int finishCol = finish.getCharPositionInLine();
	    errors += startLine + ":" + startCol + "-" +
                               finishLine + ":" + finishCol
		   + " " + message +"\n";
	    System.err.print(startLine + ":" + startCol + "-" +
	              finishLine + ":" + finishCol
	              + " " + message+"\n");
		errorCount++;
	}
	//return the number of contextual errors
	public int getNumberOfContextualErrors () {
		return errorCount;
	}
	// Scope checking
	private SymbolTable<Type> typeTable =
	   new SymbolTable<Type>();
	private void predefine () {
		typeTable.put("input",
		   new Type.Mapping(Type.EMPTY, Type.INT));
		typeTable.put("print",
		   new Type.Mapping(Type.SEQUENCE_INT,Type.VOID));
	}
	//Define input/output methods
	private void define (String id, Type type,
	                     ParserRuleContext decl) {
		boolean ok = typeTable.put(id, type);
		if (!ok)
			reportError(id + " is redeclared", decl);
	}
	//Define a variable/function
	private void remove (String id, Type type,
            ParserRuleContext decl) {

		boolean ok = typeTable.remove(id, type);
		if (!ok)
		reportError(id + " is undeclared,so it cannot be removed ", decl);
	}
	//Retrieve the type of a variable/function
	private Type retrieve (String id, ParserRuleContext occ) {
		Type type = typeTable.get(id);
		if (type == null) {
			reportError(id + " is undeclared, so it cannot be retrieved", occ);
			return Type.ERROR;
		} else
			return type;
	}
	// Type checking
	private static final Type.Mapping  
	   COMPTYPE = new Type.Mapping(
	      new Type.Pair(Type.INT, Type.INT), Type.BOOL),
	   ARITHTYPE = new Type.Mapping(
	      new Type.Pair(Type.INT, Type.INT), Type.INT);
	//Check the expected type and actual type of a variable
	private void checkType (Type typeExpected,
	                        Type typeActual,
	                        ParserRuleContext construct) {
		if (! typeActual.equiv(typeExpected))
			reportError("type is " + typeActual
			   + ", should be " + typeExpected,
			   construct);
	}
	//Check the type of a function
	private Type checkCall (String id, Type typeArg,
	                        ParserRuleContext call) {
		Type typeProc = retrieve(id, call);
		if (! (typeProc instanceof Type.Mapping)) {
			reportError(id + " is not a procedure", call);
			return Type.ERROR;
		} else {
			Type.Mapping mapping = (Type.Mapping)typeProc;
			checkType(mapping.domain, typeArg, call);
			return mapping.range;
		}
	}
	//Check type of binary operations
	private Type checkBinary (Type.Mapping typeOp,
	                          Type typeArg1, Type typeArg2,
	                          ParserRuleContext op) {
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
	//visitor for Single_input
	@Override
	public Type visitInput(InputContext ctx) {		 						
		predefine();
		visitChildren(ctx);
		return null;
	}
	//visitor for small_stmt
	@Override
	public Type visitSmall_stmt(Small_stmtContext ctx) {					
		Type t;
		TestlistContext var = ctx.e1;
		TestlistContext value = ctx.e2;
		List<TestContext> var_list = var.test();
		if(value == null) {
			for(pythonParser.TestContext v : var_list)
				visit(v);
		}
		else {
			List<TestContext> value_list = value.test();
			if(value_list.size() == var_list.size()) {
				pythonParser.TestContext v_name;
				pythonParser.TestContext v_value;
				for(int i = 0; i < var_list.size(); i++) {
					v_name = var_list.get(i);
					v_value = value_list.get(i);
					Pattern pattern = Pattern.compile("[0-9]*");  
					//assign a variable to another variable
					if(!pattern.matcher(v_value.getText()).matches()
							&& !v_value.getText().equals("True")
							&& !v_value.getText().equals("False")
							&& !v_value.getText().contains("\"")
							&& !v_value.getText().contains("*")
							&& !v_value.getText().contains("-")
							&& !v_value.getText().contains("/")
							&& !v_value.getText().contains("+")
							&& !v_value.getText().contains("%")
							&& !v_value.getText().contains("<")
							&& !v_value.getText().contains(">")
							&& !v_value.getText().contains("==")
							&& !v_value.getText().contains("!=")
							&& !v_value.getText().contains("<=")
							&& !v_value.getText().contains(">=")
							)
						//check whether the variable at the right of "=" has been defined
						retrieve(v_value.getText(), ctx);
					t = visit(v_value);
					Type type;
					//This is a local variable, check if it has been defined locally
					if(local ==true)
						type = typeTable.getLocal(v_name.getText());
					//This is a global variable, check if it has been defined globally
					else
						type = typeTable.getGlobal(v_name.getText());
					//The variable has not been defined
					if(type == null) {
						define(v_name.getText(), t, ctx);
						System.out.println(t.toString() + " variable " + v_name.getText() + " is DEFINED.");
					}
					//The variable has been defined, python allows it to be redefined
					else if(type != t){
						remove(v_name.getText(), type, ctx);
						System.out.println(type.toString() + " variable " + v_name.getText() + " is REMOVED.");
						define(v_name.getText(), t, ctx);
						System.out.println(t.toString() + " variable " + v_name.getText() + " is REDIFINED.");
					}
				}
			}
			else 
				reportError("disparity of values and variables",ctx);
		}
		return null;
	}
	//visitor for testList
	@Override
	public Type visitTestlist(TestlistContext ctx) {						
		List<TestContext> nodes = ctx.test();
		ArrayList<Type> array = new ArrayList<Type>();
		Type t;
		Type seqtype ;
		if (nodes != null) {
			for (pythonParser.TestContext node : nodes) {
				t = visit(node);
				array.add(t);
			}				
			seqtype = new Type.Sequence(array);}
		else
			seqtype = Type.EMPTY;
	    
	    return seqtype;
	}
	//visitor for test
	@Override
	public Type visitTest(TestContext ctx) {							
		if(ctx.e2 == null) {
			visit(ctx.e1);
			return Type.BOOL;
			}
		else {
			return visit(ctx.e2);	
		}
	}
	//visitor for comparison
	@Override
	public Type visitComparison(ComparisonContext ctx) {				
		Type t1;
		t1 = visit(ctx.e1);
		Type t2;
		if(ctx.comparison_suffix() != null) {
			for(Comparison_suffixContext e : ctx.comparison_suffix()) {
				t2 = visit(e);
				t1 = checkBinary(COMPTYPE, t1, t2, ctx);
			}
			return t1;
		}
		else {
		    	return t1;
		    }
	}
	//visitor for expr
	@Override
	public Type visitExpr(ExprContext ctx) {							
		Type t1;
		Type t2;
		t1 = visit(ctx.e1);
		if(ctx.expr_suffix() != null) {
			for(Expr_suffixContext e : ctx.expr_suffix()) {
				t2 = visit(e);
				t1 = checkBinary(ARITHTYPE, t1, t2, ctx);
			}
			return t1;
		}
		else {
		    	return t1;
		    }
	}
	//visitor for comparison_suffix
	@Override
	public Type visitComparison_suffix(Comparison_suffixContext ctx) {
		return visit(ctx.e2);
	}
	//visitor for expr_suffix
	@Override
	public Type visitExpr_suffix(Expr_suffixContext ctx) {
		return visit(ctx.e2);
	}
	//visitor for num
	@Override
	public Type visitNum(NumContext ctx) {								
		return Type.INT;
	}
	//visitor for string
	@Override
	public Type visitString(StringContext ctx) {						
		return Type.STRING;
	}
	//visitor for True
	@Override
	public Type visitTrue(TrueContext ctx) {							
		return Type.BOOL;
	}//visitor for False
	@Override
	public Type visitFalse(FalseContext ctx) {							
		return Type.BOOL;
	}
	//visitor for id
	@Override
	public Type visitId(IdContext ctx) {								
		return retrieve(ctx.NAME().getText(), ctx);
	}
	//visitor for funccall
	@Override
	public python.Type visitFunccall(FunccallContext ctx) {				
		Type para_type;
		List<TestContext> testlist = ctx.test();
		ArrayList<Type> array = new ArrayList<Type>();
		Type t;
		if(testlist != null) {		
			for(TestContext e:testlist) {
				t = visit(e);
				array.add(t);
			}
			para_type = new Type.Sequence(array);
			}
		else 
			para_type = Type.EMPTY;
		Type t1 = checkCall(ctx.NAME().getText(), para_type, ctx);
	    return t1;
	}
	//visitor for parameterList
	@Override
	public Type visitParameterlist(ParameterlistContext ctx) {			
		List<ParameterContext> para_del = ctx.parameter();
		ArrayList<Type> array = new ArrayList<Type>();
		Type t;
		Type seqtype ;
		if (para_del != null) {//parameter list not null
			for (pythonParser.ParameterContext para : para_del) {
					t = visit(para);
					array.add(t);
			}				
			seqtype = new Type.Sequence(array);}
		else
			seqtype = Type.EMPTY;
	    
	    return seqtype;
	}
	//visitor for parameter
	@Override
	public Type visitParameter(ParameterContext ctx) {					
		String type;
		Type t;
		if(ctx.test() != null) {
			type = ctx.test().toString();
			if(type == "int") {//parameter:int
				t = Type.INT;
				define(ctx.NAME().getText(),t,ctx);
				return t;
			}
			else if(type == "bool") {//parameter:bool
				t = Type.BOOL;
				define(ctx.NAME().getText(),t,ctx);
				return t;
			}
			else if(type == "string") {//parameter:string
				t = Type.STRING;
				define(ctx.NAME().getText(),t,ctx);
				return t;
			}
			else {
				define(ctx.NAME().getText(),Type.INT,ctx);
				return Type.INT;
			}
		}
		else {
			define(ctx.NAME().getText(),Type.INT,ctx);
			return Type.INT;
		}
	}
	//visitor for suite
	@Override
	public Type visitSuite(SuiteContext ctx) {							
		Type ret_type = Type.VOID;
		visitChildren(ctx);
		if(ctx.return_stmt()!= null) {
			ret_type = visit(ctx.return_stmt());
		}
		return ret_type;
	}
	//visitor for compound_stmt
	@Override
	public Type visitCompound_stmt(Compound_stmtContext ctx) {			
		visitChildren(ctx);
	    return null;
	}
	//visitor for if_stmt
	@Override
	public Type visitIf_stmt(If_stmtContext ctx) {							
		Type t1 = visit(ctx.t1);//if judgement condition
		if(t1 == Type.INT)
			t1 = Type.BOOL;
		checkType(Type.BOOL, t1, ctx);
		 visit(ctx.s1);
		
		if (ctx.s2 != null) {//else-if judgement condition
			Type t2 = visit(ctx.t2);
			if(t2 == Type.INT)
				t2 = Type.BOOL;
			checkType(Type.BOOL, t2, ctx);
			visit(ctx.s2);
		}

		
	    if (ctx.s3 != null) {
	    	visit(ctx.s3);
	    }

	    return null;
	}
	//visitor for while_stmt
	@Override
	public Type visitWhile_stmt(While_stmtContext ctx) {				
		Type t = visit(ctx.test());
		if(t == Type.INT)
			t = Type.BOOL;
		checkType(Type.BOOL, t, ctx);
	    visit(ctx.s1);
	    if (ctx.s2 != null)
			visit(ctx.s2);
	    return null;
	}
	//visitor for parens
	@Override
	public Type visitParens(ParensContext ctx) {						
		return visit(ctx.test());
	}
	//visitor for return_stmt
	@Override
	public Type visitReturn_stmt(Return_stmtContext ctx) {				
		if(ctx.test() == null) {
			return Type.VOID;
			}
		else {
			return visit(ctx.test());
			}
	}
	//visitor for funcdef
	@Override
	public Type visitFuncdef(FuncdefContext ctx) {						
		typeTable.enterLocalScope();	
		local = true;
		ParameterlistContext pl = ctx.parameterlist();//parameter list
		Type seqtype;
		if(pl != null) {
			seqtype = visit(pl);	// parameter type
		}
		else
			seqtype = Type.EMPTY;
		Type rettype = visit(ctx.suite());
		
		Type functype = new Type.Mapping(seqtype, rettype);//function type
	    define(ctx.NAME().getText(), functype, ctx);	// put function type  into type table
		typeTable.exitLocalScope();
		local = false;
		define(ctx.NAME().getText(), functype, ctx);
		return null;
	}
	//visitor for FunctionCall
	@Override
	public Type visitFunctionCall(FunctionCallContext ctx) {
		Type para_type;
		Type t1;
		if(ctx.testlist() != null) {			
			para_type =Type.SEQUENCE_INT;
			}
		else 
			para_type = Type.EMPTY;
		if(ctx.func.getText().equals("input"))
			t1 = Type.INT;
		else
			t1 = Type.VOID;
		if(ctx.var != null) {
			Type type = typeTable.get(ctx.var.getText());
			if(type == null) {
				define(ctx.var.getText(), t1, ctx);
			}
			else if(type != t1){
				remove(ctx.var.getText(), type, ctx);
				System.out.println(type.toString() + " variable " + ctx.var.getText() + " is REMOVED.");
				define(ctx.var.getText(), t1, ctx);
				System.out.println(t1.toString() + " variable " + ctx.var.getText() + " is REDIFINED.");
			}
		}
	    return t1;
	}
}
