// Driver for the C typechecker

package C;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

public class CCheck {

	private static boolean tracing = false;

	private static PrintStream out = System.out;

	public static void main(String[] args) {
	// Compile a C source program to SVM code, 
	// then interpret it if it compiles successfully.
	// The source file name must be given as the 
	// first program argument.
		try {
			if (args.length == 0)
				throw new CException();
			check(args[0]);
		} catch (CException x) {
			out.println("Contextual analysis failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}

	private static void check (String filename)
			throws Exception {
		CLexer lexer = new CLexer(
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
		CParser parser = new CParser(tokens);
	        ParseTree tree = parser.externalDeclaration();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		if (errors > 0)
			throw new CException();
		return tree;
	}

    private static void contextualAnalyse (ParseTree tree, CommonTokenStream tokens)
			throws Exception {
		out.println("Contextual analysis ...");
		CCheckerVisitor checker =
		   new CCheckerVisitor(tokens);
		checker.visit(tree);
		int errors = checker.getNumberOfContextualErrors();
		out.println(errors + " scope/type errors");
		out.println();
		if (errors > 0)
			throw new CException();
	}

	private static class CException extends Exception {
	}

}
