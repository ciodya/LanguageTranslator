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

	public static void main(String input,LayoutController controller) {
		try {
			python objprog = compile(input,controller);
			out.println("Interpretation ...");
			objprog.interpret(tracing);
		} catch (CException x) {
			out.println("Compilation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}

	private static python compile (String input,LayoutController controller)
			throws Exception {
	// Compile a C source program to python code.
		CLexer lexer = new CLexer(
				CharStreams.fromString(input));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		ParseTree ast =
		    syntacticAnalyse(tokens,controller);
		contextualAnalyse(ast,tokens,controller);
		python objprog = codeGenerate(ast,controller);
		return objprog;
	}

	private static ParseTree syntacticAnalyse
			(CommonTokenStream tokens,LayoutController controller)
			throws Exception {
	// Perform syntactic analysis of a C source program.
		out.println();
		out.println("Syntactic analysis ...");
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

    private static void contextualAnalyse (ParseTree tree, CommonTokenStream tokens,LayoutController controller)
			throws Exception {
	// Perform contextual analysis of a C program, 
		out.println("Contextual analysis ...");
		CCheckerVisitor checker =
		   new CCheckerVisitor(tokens);
		checker.visit(tree);
		int errors = checker.getNumberOfContextualErrors();
		out.println(errors + " scope/type errors");
		out.println();
		if (errors > 0) {
			controller.contextualError();
			throw new CException();
		}
	}

	private static python codeGenerate (ParseTree tree,LayoutController controller)
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
