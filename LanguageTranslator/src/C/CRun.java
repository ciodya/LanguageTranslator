/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
 * Driver for translating C source code to Python code
*/

package C;

import java.io.PrintStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import C.CLexer;
import C.CParser;
import C.CCheckerVisitor;
import C.CEncoderVisitor;
import C.python;

import Application.LayoutController;

public class CRun {
	private static boolean tracing = false;
	private static PrintStream out = System.out;
	//Constructor
	public static void main(String input,LayoutController controller) {
		try {
			python objprog = compile(input,controller);
			objprog.interpret(tracing);
		} catch (CException x) {
			out.println("Translation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}
	// Compilation, include syntactic analysis, contextual analysis and code translation
	private static python compile (String input,LayoutController controller)
			throws Exception {
		CLexer lexer = new CLexer(
				CharStreams.fromString(input));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		ParseTree ast =
		    syntacticAnalyse(tokens,controller);
		contextualAnalyse(ast,tokens,controller);
		python objprog = codeTranslate(ast,controller);
		return objprog;
	}
	//Syntactic analysis for a C source program
	private static ParseTree syntacticAnalyse
			(CommonTokenStream tokens,LayoutController controller)
			throws Exception {
		CParser parser = new CParser(tokens);
	    ParseTree tree = parser.externalDeclaration();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		if (errors > 0) {
			controller.syntaxError();
			throw new CException();
		}
		return tree;
	}
	//Contextual analysis for a C source program
    private static void contextualAnalyse (ParseTree tree, CommonTokenStream tokens,LayoutController controller)
			throws Exception {
		CCheckerVisitor checker =
		   new CCheckerVisitor(tokens);
		checker.visit(tree);
		int errors = checker.getNumberOfContextualErrors();
		out.println(errors + " scope/type errors");
		out.println();
		if (errors > 0) {
			controller.contextualError(checker.showErrors()+ errors + " scope/type errors.\n");
			throw new CException();
		}
	}
    //Code translation, generating a equivalent Python program
	private static python codeTranslate (ParseTree tree,LayoutController controller)
			throws Exception  {
		CEncoderVisitor encoder =
		   new CEncoderVisitor();
		encoder.visit(tree);
		python objectprog = encoder.getPython();
		String output = objectprog.showCode();
		controller.setCode(output);
		return objectprog;
	}
	private static class CException extends Exception {
	}
}
