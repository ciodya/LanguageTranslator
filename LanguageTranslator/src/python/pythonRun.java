/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * Driver for translating Python source code to C code
*/

package python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import Application.LayoutController;

import java.io.*;

public class pythonRun {
	private static boolean tracing = false;
	private static PrintStream out = System.out;
	//Constructor
	public static void main(String input,LayoutController controller) {
		try {
			C objprog = compile(input,controller);
			out.println("Interpretation ...");
			objprog.interpret(tracing);
		} catch (pythonException x) {
			out.println("Compilation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}
	// Compilation, include syntactic analysis, contextual analysis and code translation
	private static C compile (String input,LayoutController controller)
			throws Exception {
		pythonLexer lexer = new pythonLexer(
				CharStreams.fromString(input));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		ParseTree ast =
		    syntacticAnalyse(tokens,controller);
		contextualAnalyse(ast,tokens,controller);
		C objprog = codeGenerate(ast,controller);
		return objprog;
	}
	//Syntactic analysis for a Python source program
	private static ParseTree syntacticAnalyse
			(CommonTokenStream tokens,LayoutController controller)
			throws Exception {
		out.println();
		out.println("Syntactic analysis ...");
		pythonParser parser = new pythonParser(tokens);
	        ParseTree tree = parser.input();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		if (errors > 0) {
			controller.syntaxError();
			throw new pythonException();
			}
		return tree;
	}
	//Contextual analysis for a Python source program
    private static void contextualAnalyse (ParseTree tree, CommonTokenStream tokens
    										,LayoutController controller)
			throws Exception {
		out.println("Contextual analysis ...");
		pythonCheckerVisitor checker =
		   new pythonCheckerVisitor(tokens);
		checker.visit(tree);
		int errors = checker.getNumberOfContextualErrors();
		out.println(errors + " scope/type errors");
		out.println();
		if (errors > 0) {
			controller.contextualError(checker.showErrors()+ errors + " scope/type errors.\n");
			throw new pythonException();
		}
	}
  //Code translation, generating a equivalent C program
	private static C codeGenerate (ParseTree tree,LayoutController controller)
			throws Exception  {
		pythonEncoderVisitor encoder =
		   new pythonEncoderVisitor();
		encoder.visit(tree);
		C objectprog = encoder.getC();
		String output = objectprog.showCode();
		controller.setCode(output);
		return objectprog;
	}
	private static class pythonException extends Exception {
	}
}
