// Driver for the python typechecker
package python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class pythonCheck {
	private static boolean tracing = false;
	private static PrintStream out = System.out;
	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new pythonException();
			check(args[0]);
		} catch (pythonException x) {
			out.println("Contextual analysis failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}
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
	private static ParseTree syntacticAnalyse
			(CommonTokenStream tokens)
			throws Exception {
		out.println();
		out.println("Syntactic analysis ...");
		pythonParser parser = new pythonParser(tokens);
	        ParseTree tree = parser.input();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		if (errors > 0)
			throw new pythonException();
		return tree;
	}
    private static void contextualAnalyse (ParseTree tree, CommonTokenStream tokens)
			throws Exception {
		out.println("Contextual analysis ...");
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
