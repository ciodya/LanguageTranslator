/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * Driver for the C syntactic analyser.
*/

package C;

import java.io.PrintStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class CParse {
	private static PrintStream out = System.out;
	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new CException();
			ParseTree tree =
			   syntacticAnalyse(args[0]);
		} catch (CException x) {
			out.println("Translation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}
	// Perform syntactic analysis of a C source program.
	private static ParseTree syntacticAnalyse
			(String filename)
			throws Exception {
		CLexer lexer = new CLexer(
				CharStreams.fromFileName(filename));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		CParser parser = new CParser(tokens);
		ParseTree tree = parser.externalDeclaration();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		System.out.println(tree.toStringTree(parser));
		if (errors > 0)
			throw new CException();
		return tree;
	}
	private static class CException extends Exception {
	}
}
