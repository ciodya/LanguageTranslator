/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * A visitor for code translation of Python
*/

package python;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import python.pythonParser.ComparisonContext;
import python.pythonParser.Compound_stmtContext;
import python.pythonParser.ExprContext;
import python.pythonParser.FalseContext;
import python.pythonParser.FunccallContext;
import python.pythonParser.FuncdefContext;
import python.pythonParser.FunctionCallContext;
import python.pythonParser.IdContext;
import python.pythonParser.If_stmtContext;
import python.pythonParser.InputContext;
import python.pythonParser.NumContext;
import python.pythonParser.ParameterContext;
import python.pythonParser.ParameterlistContext;
import python.pythonParser.ParensContext;
import python.pythonParser.Return_stmtContext;
import python.pythonParser.Small_stmtContext;
import python.pythonParser.StringContext;
import python.pythonParser.SuiteContext;
import python.pythonParser.TestContext;
import python.pythonParser.TestlistContext;
import python.pythonParser.TrueContext;
import python.pythonParser.While_stmtContext;

public class pythonEncoderVisitor extends AbstractParseTreeVisitor<Void> implements pythonVisitor<Void>  {
	private List<String> var_list = new ArrayList<>();
	private List<String> local_var_list = new ArrayList<>();
	private int infunc = 1;
	private C obj = new C();
	public C getC() {
	    return obj;
	}
	@Override
	public Void visitInput(InputContext ctx) {
		obj.addCode("void main(){ \n");
		visitChildren(ctx);
		obj.addCode("}");
		var_list.clear();
		local_var_list.clear();
		return null;
	}
	@Override
	public Void visitFunctionCall(FunctionCallContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		if(ctx.func.getText().trim().equals("input")) {
			if(!var_list.contains(ctx.var.getText()) && !local_var_list.contains(ctx.var.getText())) {
				obj.addCode("int " + ctx.var.getText() + ";\n");
				var_list.add(ctx.var.getText());
				for(int i = 0; i < infunc; i++)
					obj.addCode("\t");
			}
			obj.addCode("scanf(" + ctx.var.getText() + ")");
		}
		if(ctx.func.getText().trim().equals("print")) {
			obj.addCode("printf(");
			visit(ctx.testlist());
			obj.addCode(")");
		}
		obj.addCode(";\n");	
		return null;
	}
	@Override
	public Void visitReturn_stmt(Return_stmtContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		obj.addCode("return ");
		visit(ctx.test());
		obj.addCode("; \n");
		return null;
	}
	@Override
	public Void visitSmall_stmt(Small_stmtContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		if(ctx.e2 != null) {
			List<pythonParser.TestContext> e1 = ctx.e1.test();
			List<pythonParser.TestContext> e2 = ctx.e2.test();
			String temp;
			String typespecifier = "";
			int count = 1;
		    for (pythonParser.TestContext  i: e1) {
		    	if(count > 1) {
		    		obj.addCode("; \n");	//more than one assignment statement
		    		for(int k = 0; k < infunc; k++)
		    			obj.addCode("\t");
		    	}
		    	int index = e1.indexOf(i);
		    	temp = e2.get(index).getText();
		    	boolean flag = false;
		    	
		    	//specify variable type
		    	if(!var_list.contains(i.getText()) && !local_var_list.contains(i.getText())) {	//variable is not defined yet
			    	Pattern pattern = Pattern.compile("[0-9]*");  
			    	if(pattern.matcher(temp).matches())	//integer
			    		typespecifier = "int ";
			    	else if(temp.trim().equals("True")) {	//True
			    		typespecifier = "_Bool ";
			    		temp = "1";
			    	}
			    	else if(temp.trim().equals("False")) {	//False
			    		typespecifier = "_Bool ";
			    		temp = "0";
			    	}
			    	else if(temp.trim().contains("\""))	//string
			    		typespecifier = "char";	
			    	else if(temp.trim().contains("not")) {
			    		typespecifier = "_Bool ";
			    		flag = true;
			    	}
			    	else 
			    		typespecifier = "int ";
			    	obj.addCode(typespecifier);
		    	}
		    	//generate assignment statement in C style
		    	if(typespecifier.equals("char"))
		    		obj.addCode("[] ");
		    	visit(i);
		    	obj.addCode(" = ");
		    	if(typespecifier.trim().equals("_Bool") && flag == false)
		    		obj.addCode(temp);
		    	else
		    		visit(e2.get(index));
		    	var_list.add(i.getText());
		    	count++;
		    }
		    obj.addCode("; \n");
		}
		else {
			visit(ctx.e1);
			obj.addCode("; \n");
		}
		return null;
	}
	@Override
	public Void visitTestlist(TestlistContext ctx) {
		visitChildren(ctx);
		return null;
	}
	@Override
	public Void visitTest(TestContext ctx) {
		if(ctx.e1 != null) {
			if(ctx.e1.getText().contains("("))
			{
				obj.addCode("!");
				visit(ctx.e1);
			}
			else {
				obj.addCode("!(");
				visit(ctx.e1);
				obj.addCode(")");
			}
		}
		else
			visit(ctx.e2);
		return null;
	}
	@Override
	public Void visitComparison(ComparisonContext ctx) {
		visit(ctx.e1);
		if(ctx.op != null)
			obj.addCode(ctx.op.getText());
		if(ctx.e2 != null)
			visit(ctx.e2);
		return null;
	}
	@Override
	public Void visitExpr(ExprContext ctx) {
		visit(ctx.e1);
		if(ctx.op != null)
			obj.addCode(ctx.op.getText());
		if(ctx.e2 != null)
			visit(ctx.e2);
		return null;
	}
	@Override
	public Void visitId(IdContext ctx) {
		obj.addCode(ctx.NAME().getText());
		return null;
	}
	@Override
	public Void visitNum(NumContext ctx) {
		obj.addCode(ctx.NUMBER().getText());
		return null;
	}
	@Override
	public Void visitString(StringContext ctx) {
		obj.addCode(ctx.getText());
		return null;
	}
	@Override
	public Void visitTrue(TrueContext ctx) {
		obj.addCode(ctx.getText());
		return null;
	}
	@Override
	public Void visitFalse(FalseContext ctx) {
		obj.addCode(ctx.getText());
		return null;
	}
	@Override
	public Void visitFunccall(FunccallContext ctx) {
		obj.addCode(ctx.NAME().getText());
		obj.addCode("(");
		List<TestContext> testlist = ctx.test();
		if(testlist != null) 	
			for(TestContext e:testlist) { 
				visit(e);
			}
		obj.addCode(")");
		return null;
	}
	@Override
	public Void visitParens(ParensContext ctx) {
		obj.addCode("(");
		visit(ctx.test());
		obj.addCode(")");
		return null;
	}	
	@Override
	public Void visitCompound_stmt(Compound_stmtContext ctx) {
		visitChildren(ctx);
		return null;
	}
	@Override
	public Void visitIf_stmt(If_stmtContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		infunc++;
		obj.addCode("if(");//generate if statement
		visit(ctx.t1);
		obj.addCode(")");
		visit(ctx.s1);
		if(ctx.s2 != null) {	//generate elif statement
			for(int i = 0; i < infunc-1; i++)
				obj.addCode("\t");
			obj.addCode("else if(");
			visit(ctx.t2);
			obj.addCode(")");
			visit(ctx.s2);
		}
		if(ctx.s3 != null) {	//generate else statement
			for(int i = 0; i < infunc-1; i++)
				obj.addCode("\t");
			obj.addCode("else");
			visit(ctx.s3);
		}
		infunc--;	
		return null;
	}
	@Override
	public Void visitSuite(SuiteContext ctx) {
		obj.addCode("{ \n");
		visitChildren(ctx);
		for(int i = 0; i < infunc-1; i++)
			obj.addCode("\t");
		obj.addCode("}\n");
		return null;
	}
	@Override
	public Void visitWhile_stmt(While_stmtContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		infunc++;
		obj.addCode("while(");
		visit(ctx.test());
		obj.addCode(")");
		visit(ctx.s1);
		if(ctx.s2 != null) {
			for(int i = 0; i < infunc-1; i++)
				obj.addCode("\t");
			obj.addCode("if(!(");
			visit(ctx.test());
			obj.addCode("))");
			visit(ctx.s2);
		}
		infunc--;	
		return null;
	}
	@Override
	public Void visitFuncdef(FuncdefContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		String typespecifier = "";
		if(ctx.suite().return_stmt() != null) {
			typespecifier = "int";
		}
		else
			typespecifier = "void";
		obj.addCode(typespecifier + " " + ctx.NAME().getText());
		visit(ctx.parameterlist());
		infunc++;
		visit(ctx.suite());
		infunc--;
		local_var_list.clear();
		return null;
	}
	@Override
	public Void visitParameterlist(ParameterlistContext ctx) {
		obj.addCode("(");
		List<pythonParser.ParameterContext> list = ctx.parameter();
		int count = 1;
		if(list.size() > 0) {
			for(pythonParser.ParameterContext e : list) {
				if(count > 1)
					obj.addCode(", ");
				visit(e);
				count++;
			}
		}
		obj.addCode(")");
		return null;
	}
	@Override
	public Void visitParameter(ParameterContext ctx) {
		obj.addCode("int " + ctx.NAME().getText());
		local_var_list.add(ctx.NAME().getText());
		return null;
	}
}
