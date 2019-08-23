/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * Driver for the python syntactic analyser.
*/

package python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class pythonParse {
	private static PrintStream out = System.out;
	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new pythonException();
			ParseTree tree =
			   syntacticAnalyse(args[0]);
		} catch (pythonException x) {
			out.println("Translation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}
	// Perform syntactic analysis of a Python source program.
	private static ParseTree syntacticAnalyse
			(String filename)
			throws Exception {
		pythonLexer lexer = new pythonLexer(
				CharStreams.fromFileName(filename));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		pythonParser parser = new pythonParser(tokens);
		ParseTree tree = parser.input();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		System.out.println(tree.toStringTree(parser));
		if (errors > 0)
			throw new pythonException();
		return tree;
	}
	private static class pythonException extends Exception {
	}
}
