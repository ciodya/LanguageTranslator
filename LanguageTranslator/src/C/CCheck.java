/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
 * Driver for C type checker
*/

package C;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import C.CParser.ExternalDeclarationContext;

import java.io.*;
import java.util.Arrays;
import java.util.concurrent.Future;

import javax.swing.JDialog;

public class CCheck {
	private static PrintStream out = System.out;
	//Constructor
	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new CException();
			check(args[0]);
		} catch (CException x) {
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}
	//Do type checking for a C file, include syntactic analysis and contextual analysis
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
	//Syntactic analysis
	private static ParseTree syntacticAnalyse
			(CommonTokenStream tokens)
			throws Exception {
		CParser parser = new CParser(tokens);
        ParseTree tree = parser.externalDeclaration();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		if (errors > 0)
			throw new CException();
		return tree;
	}
	//Contextual analysis
    private static void contextualAnalyse (ParseTree tree, CommonTokenStream tokens)
			throws Exception {
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
