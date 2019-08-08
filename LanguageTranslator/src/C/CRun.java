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

public class CRun {
	private static boolean tracing = false;

	private static PrintStream out = System.out;

	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new CException();
			python objprog = compile(args[0]);

			out.println("Interpretation ...");
			objprog.interpret(tracing);
		} catch (CException x) {
			out.println("Compilation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}

	private static python compile (String filename)
			throws Exception {
	// Compile a C source program to SVM code.
		CLexer lexer = new CLexer(
				CharStreams.fromFileName(filename));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		ParseTree ast =
		    syntacticAnalyse(tokens);
		contextualAnalyse(ast,tokens);
		python objprog = codeGenerate(ast);
		return objprog;
	}

	private static ParseTree syntacticAnalyse
			(CommonTokenStream tokens)
			throws Exception {
	// Perform syntactic analysis of a C source program.
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
	// Perform contextual analysis of a C program, 
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

	private static python codeGenerate (ParseTree tree)
			throws Exception  {
		out.println("Code generation ...");
		CEncoderVisitor encoder =
		   new CEncoderVisitor();
		encoder.visit(tree);
		python objectprog = encoder.getPython();
		out.println("Object code:");
		out.println(objectprog.showCode());
		return objectprog;
	}

	private static class CException extends Exception {
	}

}
