// Driver for the python syntactic analyser.

package python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

import python.*;

public class pythonParse {

	private static boolean tracing = false;

	private static PrintStream out = System.out;

	public static void main(String[] args) {
	// Compile a Fun source program to SVM code, 
	// then interpret it if it compiles successfully.
	// The source file name must be given as the 
	// first program argument.
		try {
			if (args.length == 0)
				throw new pythonException();
			ParseTree tree =
			   syntacticAnalyse(args[0]);
		} catch (pythonException x) {
			out.println("Compilation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}

	private static ParseTree syntacticAnalyse
			(String filename)
			throws Exception {
		out.println();
		out.println("Syntactic analysis ...");
		pythonLexer lexer = new pythonLexer(
				CharStreams.fromFileName(filename));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		pythonParser parser = new pythonParser(tokens);
		ParseTree tree = parser.input();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		if (errors > 0)
			throw new pythonException();
		return tree;
	}

	private static class pythonException extends Exception {
	}

}
