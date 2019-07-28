package python;

import java.util.HashMap;

public class SymbolTable<A> {

		private HashMap<String,A> globals, locals;

		public SymbolTable () {
			globals = new HashMap<String,A>();
			locals = null;  // initially disabled
		}

		public boolean put (String id, A attr) {
			HashMap<String,A> scope =
				(locals != null ? locals : globals);
			if (scope.get(id) == null) {
				scope.put(id, attr);
				return true;
			} else
				return false;
		}
		
		public boolean remove (String id, A attr) {
			HashMap<String,A> scope =
				(locals != null ? locals : globals);
			if (scope.get(id) != null) {
				scope.remove(id, attr);
				return true;
			} else
				return false;
		}

		public A get (String id) {
			if (locals != null && locals.get(id) != null)
				return locals.get(id);
			else
				return globals.get(id);
		}

		public A getLocal (String id) {
			if (locals != null)
				return locals.get(id);
			else
				return null;
		}

		public void enterLocalScope () {
		// Enable the local part of this symbol table.
			// Assume that locals == null.
			locals = new HashMap<String,A>();
		}

		public void exitLocalScope () {
			locals = null;
		}

		public String toString () {
			String s = "Globals: " + globals + "\n";
			if (locals != null)
				s += "Locals: " + locals + "\n";
			return s;
		}

	/*
		public static void main (String[] args) {
		// Test the symbol table class.
			SymbolTable<String> table =
			   new SymbolTable<String> ();
			PrintStream out = System.out;
			out.print(table);
			table.put("UK", "London");
			table.put("DE", "Bonn");
			out.print(table);
			out.println("UK's capital is " + table.get("UK"));
			out.println("DE's capital is " + table.get("DE"));
			out.println("XY's capital is " + table.get("XY"));
			table.enterLocalScope();
			out.print(table);
			table.put("FR", "Paris");
			table.put("DE", "Berlin");
			out.print(table);
			out.println("UK's capital is " + table.get("UK"));
			out.println("DE's capital is " + table.get("DE"));
			out.println("FR's capital is " + table.get("FR"));
			out.println("YZ's capital is " + table.get("YZ"));
			table.exitLocalScope();
			out.print(table);
			out.println("UK's capital is " + table.get("UK"));
			out.println("DE's capital is " + table.get("DE"));
			out.println("FR's capital is " + table.get("FR"));
		}
	*/

}
