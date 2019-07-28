// Driver for the python compiler and SVM interpreter.

package python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

import python.*;

public class pythonRun {

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
			SVM objprog = compile(args[0]);

			out.println("Interpretation ...");
			objprog.interpret(tracing);
		} catch (pythonException x) {
			out.println("Compilation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}

	private static SVM compile (String filename)
			throws Exception {
	// Compile a Fun source program to SVM code.
		pythonLexer lexer = new pythonLexer(
				CharStreams.fromFileName(filename));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		ParseTree ast =
		    syntacticAnalyse(tokens);
		contextualAnalyse(ast,tokens);
		SVM objprog = codeGenerate(ast);
		return objprog;
	}

	private static ParseTree syntacticAnalyse
			(CommonTokenStream tokens)
			throws Exception {
	// Perform syntactic analysis of a Fun source program.
	// Print any error messages.
	// Return a syntax tree representation of the Fun program.
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
	// Perform contextual analysis of a Fun program, 
	// represented by a syntax tree.
	// Print any error messages.
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

	private static SVM codeGenerate (ParseTree tree)
			throws Exception  {
	// Perform code generation of a Fun program, 
	// represented by a syntax tree, emitting SVM code.
	// Also print the object code.
		out.println("Code generation ...");
		pythonEncoderVisitor encoder =
		   new pythonEncoderVisitor();
		encoder.visit(tree);
		SVM objectprog = encoder.getSVM();
		out.println("Object code:");
		out.println(objectprog.showCode());
		return objectprog;
	}

	private static class pythonException extends Exception {
	}

}
