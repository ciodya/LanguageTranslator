/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
 * A visitor for code translation of C
*/

package C;

import java.util.List;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import C.CParser.ActualContext;
import C.CParser.ArithExpressionContext;
import C.CParser.ArithExpression_suffixContext;
import C.CParser.Assn_stmtContext;
import C.CParser.BlockItemListContext;
import C.CParser.BoolContext;
import C.CParser.CharContext;
import C.CParser.Char_arrayContext;
import C.CParser.Char_valueContext;
import C.CParser.Compound_stmtContext;
import C.CParser.Expr_stmtContext;
import C.CParser.ExpressionContext;
import C.CParser.Expression_suffixContext;
import C.CParser.ExternalDeclarationContext;
import C.CParser.Func_callContext;
import C.CParser.Func_stmtContext;
import C.CParser.FunccallContext;
import C.CParser.IdContext;
import C.CParser.If_stmtContext;
import C.CParser.IntContext;
import C.CParser.Notvoid_funcContext;
import C.CParser.NumContext;
import C.CParser.ParameterContext;
import C.CParser.ParameterlistContext;
import C.CParser.ParensContext;
import C.CParser.Var_delContext;
import C.CParser.VoidContext;
import C.CParser.Void_funcContext;
import C.CParser.While_stmtContext;

public class CEncoderVisitor extends AbstractParseTreeVisitor<Void> implements CVisitor<Void>  {
	private int infunc = 0; //variable to record numbers of indentation
	private python obj = new python();
	public python getPython() {
	    return obj;
	}
	@Override
	public Void visitExternalDeclaration(ExternalDeclarationContext ctx) {
		visitChildren(ctx);
		return null;
	}
	@Override
	public Void visitVar_del(Var_delContext ctx) {
		if(ctx.id2 != null) {
			for(int i = 0; i < infunc; i++) //indentation
				obj.addCode("\t");
			String inst = "";
			inst += ctx.id2.getText() + " = ";
			obj.addCode(inst);
			if(ctx.typeSpecifier().getText().equals("_Bool") && ctx.c1.getText().trim().equals("0"))
				obj.addCode("False");// convert boolean value from 0 to False
			else if(ctx.typeSpecifier().getText().equals("_Bool") && ctx.c1.getText().trim().equals("1"))
				obj.addCode("True");// convert boolean value from 1 to True
			else
				visit(ctx.c1);
			obj.addCode("\n");
		}
		if(ctx.id4 != null) {
			for(int i = 0; i < infunc; i++)
				obj.addCode("\t");
			String inst = "";
			inst += ctx.id4.getText() + " = ";
			obj.addCode(inst);
			visit(ctx.c2);
			obj.addCode("\n");
		}
		return null;
	}
	@Override
	public Void visitVoid_func(Void_funcContext ctx) {
		String inst = "";
		String funcname = ctx.id1.getText().trim();
		if(!funcname.equals("main")) { //omit function 'main' in C
			inst = "def " + funcname;
			if(ctx.parameterlist() !=null) { //omit parameter types
				String par = ctx.parameterlist().getText();
				par = par.replace("int", "");
				par = par.replace("_Bool", "");
				par = par.replace("char", "");
				inst += "(" + par + ")";
			}
			else 
				inst += "()";
			inst += ": \n";
			infunc++; //not function 'main', there should be new indentation
		}
		else funcname = "";
		obj.addCode(inst);
		List<CParser.BlockItemListContext> bllist = ctx.blockItemList();
	    for (CParser.BlockItemListContext bl : bllist) {
	    	visit(bl);
	    }
	    if(!funcname.equals("main")) 
	    	infunc--;
	    obj.addCode("\n");//add dedentation
		return null;
	}
	@Override
	public Void visitNotvoid_func(Notvoid_funcContext ctx) {
		String inst = "";
		String funcname = ctx.id2.getText().trim();
		if(!funcname.equals("main")) {
			inst = "def " + funcname;
			if(ctx.parameterlist() !=null) {
				String par = ctx.parameterlist().getText();
				par = par.replace("int", "");
				par = par.replace("_Bool", "");
				par = par.replace("char", "");
				inst += "(" + par + ")";
			}
			else 
				inst += "()";
			inst += ": \n";
			infunc++;
		}
		else funcname = "";
		obj.addCode(inst);
		
		List<CParser.BlockItemListContext> bllist = ctx.blockItemList();
	    for (CParser.BlockItemListContext bl : bllist) {
	    	visit(bl);
	    }
	    for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
	    obj.addCode("return ");
	    visit(ctx.expression());
	    obj.addCode("\n");
	    if(!funcname.equals("main")) 
	    	infunc--;
	    obj.addCode("\n");
		return null;
	}
	@Override
	public Void visitBlockItemList(BlockItemListContext ctx) {
		visitChildren(ctx);
		return null;
	}
	@Override
	public Void visitExpression(ExpressionContext ctx) {
		if(ctx.not!=null)
			obj.addCode("not "); //not command added
		visit(ctx.e1);
		if(ctx.expression_suffix() != null) {
			for(Expression_suffixContext e : ctx.expression_suffix())
				visit(e);
		};
		return null;
	}
	@Override
	public Void visitArithExpression(ArithExpressionContext ctx) {
		visit(ctx.e1);
		if(ctx.arithExpression_suffix() != null) {
			for(ArithExpression_suffixContext e : ctx.arithExpression_suffix())
				visit(e);
		};
		return null;
	}
	@Override
	public Void visitExpression_suffix(Expression_suffixContext ctx) {
		obj.addCode(ctx.op.getText());
		visit(ctx.e2);
		return null;
	}
	@Override
	public Void visitArithExpression_suffix(ArithExpression_suffixContext ctx) {
		obj.addCode(ctx.op.getText());
		visit(ctx.e2);
		return null;
	}	
	@Override
	public Void visitNum(NumContext ctx) {
		obj.addCode(ctx.getText());
		return null;
	}
	@Override
	public Void visitId(IdContext ctx) {
		obj.addCode(ctx.getText());
		return null;
	}
	@Override
	public Void visitChar_value(Char_valueContext ctx) {
		String tmp = ctx.getText();
		tmp = tmp.replace("'", "\"");
		obj.addCode(tmp);
		return null;
	}
	@Override
	public Void visitChar_array(Char_arrayContext ctx) {
		obj.addCode(ctx.getText());
		return null;
	}
	@Override
	public Void visitParens(ParensContext ctx) {
		obj.addCode("(");
		visit(ctx.expression());
		obj.addCode(")");
		return null;
	}
	@Override
	public Void visitFunc_call(Func_callContext ctx) {
		String inst = "";
		String funcname = ctx.Identifier().getText().trim();
		if(funcname.equals("scanf")) { //function scanf called
			visit(ctx.actual());
			obj.addCode(" = input()");
		}
		else {
			if(funcname.equals("printf")) //function printf called
				funcname = "print";
			inst += funcname + "(";
			obj.addCode(inst);
			visit(ctx.actual());
			obj.addCode(")");
		}
		return null;
	}
	@Override
	public Void visitVoid(VoidContext ctx) {
		return null;
	}
	@Override
	public Void visitChar(CharContext ctx) {
		return null;
	}
	@Override
	public Void visitInt(IntContext ctx) {
		return null;
	}
	@Override
	public Void visitBool(BoolContext ctx) {
		return null;
	}
	@Override
	public Void visitCompound_stmt(Compound_stmtContext ctx) {
		if(ctx.blockItemList() != null) {
			visit(ctx.blockItemList());
		}
		return null;
	}
	@Override
	public Void visitExpr_stmt(Expr_stmtContext ctx) {
		if(ctx.expression() != null) {
			for(int i = 0; i < infunc; i++)
				obj.addCode("\t");
			visit(ctx.expression());
		}
		obj.addCode("\n");
		return null;
	}
	@Override
	public Void visitIf_stmt(If_stmtContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		infunc++; // add indentation
		String inst = "if ";
		obj.addCode(inst);
		visit(ctx.e1);
		obj.addCode(": \n");
		visit(ctx.c1);
		if(ctx.c3 != null) { //else statement
			for(int i = 0; i < infunc-1; i++)
				obj.addCode("\t");
			obj.addCode("else: \n");
			visit(ctx.c3);
		}
		infunc--;	//add dedentation
		return null;
	}
	@Override
	public Void visitWhile_stmt(While_stmtContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		infunc++; // add indentation
		String inst = "while ";
		obj.addCode(inst);
		visit(ctx.expression());
		obj.addCode(": \n");
		visit(ctx.statement());
		infunc--;	//add dedentation
		return null;
	}
	@Override
	public Void visitFunccall(FunccallContext ctx) {
		String inst = "";
		String funcname = ctx.Identifier().getText().trim();
		if(funcname.equals("scanf")) {
			visit(ctx.actual());
			obj.addCode(" = input()\n");
		}
		else {
			if(funcname.equals("printf"))
				funcname = "print";
			inst += funcname + "(";
			obj.addCode(inst);
			visit(ctx.actual());
			obj.addCode(")");
		}
		return null;
	}
	@Override
	public Void visitAssn_stmt(Assn_stmtContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		String id;
		for(int i = 0; i < ctx.Identifier().size(); i++) {
			id = ctx.Identifier(i).getText();
			obj.addCode(id + " = ");
		    visit(ctx.expression(i));
		    obj.addCode("\n");
		}
	    return null;
	}
	@Override
	public Void visitActual(ActualContext ctx) {
		List<ExpressionContext> expr = ctx.expression();
		int count = 1;
		for (CParser.ExpressionContext e : expr) {
			if(count > 1)
				obj.addCode(",");
			visit(e);
			count++;
		}
		return null;
	}
	@Override
	public Void visitFunc_stmt(Func_stmtContext ctx) {
		for(int i = 0; i < infunc; i++)
			obj.addCode("\t");
		visit(ctx.funccall());
		obj.addCode("\n");
		return null;
	}
	@Override
	public Void visitParameterlist(ParameterlistContext ctx) {
		return null;
	}
	@Override
	public Void visitParameter(ParameterContext ctx) {
		return null;
	}
}
