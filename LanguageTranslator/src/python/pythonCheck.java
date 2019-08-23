/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * Driver for Python type checker
*/

package python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class pythonCheck {
	private static PrintStream out = System.out;
	//Constructor
	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new pythonException();
			check(args[0]);
		} catch (pythonException x) {
			out.println("There are contextual errors!");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}
	//Do type checking for a C file, include syntactic analysis and contextual analysis
	private static void check (String filename)
			throws Exception {
		pythonLexer lexer = new pythonLexer(
				CharStreams.fromFileName(filename));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		ParseTree tree =
		    syntacticAnalyse(tokens);
		contextualAnalyse(tree,tokens);
	}
	//Syntactic analysis
	private static ParseTree syntacticAnalyse
			(CommonTokenStream tokens)
			throws Exception {
		pythonParser parser = new pythonParser(tokens);
	        ParseTree tree = parser.input();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		if (errors > 0)
			throw new pythonException();
		return tree;
	}
	//Contextual analysis
    private static void contextualAnalyse (ParseTree tree, CommonTokenStream tokens)
			throws Exception {
		pythonCheckerVisitor checker =
		   new pythonCheckerVisitor(tokens);
		checker.visit(tree);
		int errors = checker.getNumberOfContextualErrors();
		out.println(errors + " scope/type errors");
		out.println();
		if (errors > 0)
			throw new pythonException();
	}
	private static class pythonException extends Exception {
	}
}
