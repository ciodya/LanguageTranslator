// Driver for the python compiler and C interpreter.

package python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

import python.*;

public class pythonRun {
	private static boolean tracing = false;
	private static PrintStream out = System.out;
	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new pythonException();
			C objprog = compile(args[0]);

			out.println("Interpretation ...");
			objprog.interpret(tracing);
		} catch (pythonException x) {
			out.println("Compilation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}
	private static C compile (String filename)
			throws Exception {
		pythonLexer lexer = new pythonLexer(
				CharStreams.fromFileName(filename));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		ParseTree ast =
		    syntacticAnalyse(tokens);
		contextualAnalyse(ast,tokens);
		C objprog = codeGenerate(ast);
		return objprog;
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
	private static C codeGenerate (ParseTree tree)
			throws Exception  {
		out.println("Code generation ...");
		pythonEncoderVisitor encoder =
		   new pythonEncoderVisitor();
		encoder.visit(tree);
		C objectprog = encoder.getC();
		out.println("Object code:");
		out.println(objectprog.showCode());
		return objectprog;
	}
	private static class pythonException extends Exception {
	}
}
