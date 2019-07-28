// A visitor for contextual analysis of python.

package python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.*;

import java.util.ArrayList;
import java.util.List;

import python.pythonParser.ComparisonContext;
import python.pythonParser.Compound_stmtContext;
import python.pythonParser.ExprContext;
import python.pythonParser.FalseContext;
import python.pythonParser.FunccallContext;
import python.pythonParser.FuncdefContext;
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

	// Contextual errors

	private int errorCount = 0;

	private CommonTokenStream tokens;

	// Constructor

	public pythonCheckerVisitor(CommonTokenStream toks) {
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

	// Scope checking

	private SymbolTable<Type> typeTable =
	   new SymbolTable<Type>();

	private void predefine () {
		typeTable.put("input",
		   new Type.Mapping(Type.EMPTY, Type.INT));
		System.out.println( " input is DEFINED.");
		typeTable.put("print",
		   new Type.Mapping(Type.SEQUENCE,Type.VOID));
		System.out.println( " print is DEFINED." );
	}

	private void define (String id, Type type,
	                     ParserRuleContext decl) {
	
		boolean ok = typeTable.put(id, type);
		if (!ok)
			reportError(id + " is redeclared", decl);
	}
	
	private void remove (String id, Type type,
            ParserRuleContext decl) {

		boolean ok = typeTable.remove(id, type);
		if (!ok)
		reportError(id + " is undeclared,so it cannot be removed ", decl);
	}

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

//////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Type visitInput(InputContext ctx) {		 						//Single_input
		predefine();
		visitChildren(ctx);
		return null;
	}
	
	@Override
	public Type visitSmall_stmt(Small_stmtContext ctx) {					//small_stmt
		System.out.println("get into small statement");
		Type t;
		TestlistContext var = ctx.e1;
		TestlistContext value = ctx.e2;
		List<TestContext> var_list = var.test();
		if(value == null) {
			for(pythonParser.TestContext v : var_list)
				visit(v);
		}
		else {
			System.out.println("assign statement");
			List<TestContext> value_list = value.test();
			if(value_list.size() == var_list.size()) {
				pythonParser.TestContext v_name;
				pythonParser.TestContext v_value;
				for(int i = 0; i < var_list.size(); i++) {
					v_name = var_list.get(i);
					v_value = value_list.get(i);
					t = visit(v_value);
					Type type = typeTable.get(v_name.getText());
					if(type == null) {
						define(v_name.getText(), t, ctx);
						System.out.println(t.toString() + " variable " + v_name.getText() + " is DEFINED.");
					}
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

	@Override
	public Type visitTestlist(TestlistContext ctx) {						//testList
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

	@Override
	public Type visitTest(TestContext ctx) {								//test
		if(ctx.e2 == null) {
			visit(ctx.e1);
			return Type.BOOL;
			}
		else {
			return visit(ctx.e2);	
		}
	}

	@Override
	public Type visitComparison(ComparisonContext ctx) {					//comparison
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
	public Type visitExpr(ExprContext ctx) {								//expr
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
	public Type visitString(StringContext ctx) {							//string
		return Type.STRING;
	}

	@Override
	public Type visitTrue(TrueContext ctx) {								//True
		return Type.BOOL;
	}

	@Override
	public Type visitFalse(FalseContext ctx) {								//False
		return Type.BOOL;
	}

	@Override
	public Type visitId(IdContext ctx) {									//id
		return retrieve(ctx.NAME().getText(), ctx);
	}
	
	@Override
	public python.Type visitFunccall(FunccallContext ctx) {					//funccall
		System.out.println("enter a funccall");
//		if(ctx.NAME().getText() == "print") {
//			System.out.println("!!!!!");
////			Type type = new Type.Mapping(para_type,Type.VOID);
////			Type pre_type = typeTable.get("print");
////			typeTable.remove("print",pre_type);
////			typeTable.put("print", type);
//		}
		Type para_type;
		if(ctx.testlist() != null) {			
			para_type = visit(ctx.testlist());
			}
		else 
			para_type = Type.EMPTY;
		Type t1 = checkCall(ctx.NAME().getText(), para_type, ctx);
		
		System.out.println("Function " + ctx.NAME().getText() + " is called, its type is " + para_type +" -> " + t1);
	    return t1;
	}
	
	@Override
	public Type visitParameterlist(ParameterlistContext ctx) {				//parameterList
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

	@Override
	public Type visitParameter(ParameterContext ctx) {						//parameter
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
	
	@Override
	public Type visitSuite(SuiteContext ctx) {								//suite 
		Type ret_type = Type.VOID;
		visitChildren(ctx);
		if(ctx.return_stmt().size() > 0) {
			ret_type = visit(ctx.return_stmt().get(0));
		}
		return ret_type;
	}
	
	@Override
	public Type visitCompound_stmt(Compound_stmtContext ctx) {				//compound_stmt
		System.out.println("get into a compound stmt");
		visitChildren(ctx);
	    return null;
	}

	@Override
	public Type visitIf_stmt(If_stmtContext ctx) {							//if_stmt
		System.out.println("get into an IF ");
		Type t1 = visit(ctx.t1);//if judgement condition
		if(t1 == Type.INT)
			t1 = Type.BOOL;
		checkType(Type.BOOL, t1, ctx);
		 visit(ctx.s1);
		
		if (ctx.s2 != null) {//else-if judgement condition
			System.out.println("get into an ELSE-IF ");
			Type t2 = visit(ctx.t2);
			if(t2 == Type.INT)
				t2 = Type.BOOL;
			checkType(Type.BOOL, t2, ctx);
			visit(ctx.s2);
		}

		
	    if (ctx.s3 != null) {
	    	System.out.println("get into an ELSE ");
	    	visit(ctx.s3);
	    }

	    System.out.println("exit IF-ELSE ");
	    return null;
	}

	@Override
	public Type visitWhile_stmt(While_stmtContext ctx) {					//while_stmt
		System.out.println("get into a WHILE loop");
		Type t = visit(ctx.test());
		if(t == Type.INT)
			t = Type.BOOL;
		checkType(Type.BOOL, t, ctx);
	    visit(ctx.s1);
	    if (ctx.s2 != null)
			visit(ctx.s2);
	    System.out.println("exit WHILE loop ");
	    return null;
	}

	@Override
	public Type visitParens(ParensContext ctx) {							//parens
		return visit(ctx.test());
	}

	@Override
	public Type visitReturn_stmt(Return_stmtContext ctx) {					//return_stmt
		if(ctx.test() == null) {
			return Type.VOID;
			}
		else {
			return visit(ctx.test());
			}
	}

	@Override
	public Type visitFuncdef(FuncdefContext ctx) {							//funcdef
		System.out.println("get into function definition");
		typeTable.enterLocalScope();	
		
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
		
		define(ctx.NAME().getText(), functype, ctx);
		System.out.println("Function " + ctx.NAME().getText() + " is defined, type: " +  functype);
		return null;
	}
}
