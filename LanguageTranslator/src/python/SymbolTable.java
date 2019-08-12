/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * Representation of generic symbol tables.
*/

package python;

import java.util.HashMap;

public class SymbolTable<A> {
		private HashMap<String,A> globals, locals;
		//Contructor
		public SymbolTable () {
			globals = new HashMap<String,A>();
			locals = null;  // initially disabled
		}
		//Add (id, attr) to the symbol table
		public boolean put (String id, A attr) {
			HashMap<String,A> scope =
				(locals != null ? locals : globals);
			if (scope.get(id) == null) {
				scope.put(id, attr);
				return true;
			} else
				return false;
		}
		//Remove (id, attr) from the symbol table
		public boolean remove (String id, A attr) {
			HashMap<String,A> scope =
				(locals != null ? locals : globals);
			if (scope.get(id) != null) {
				scope.remove(id, attr);
				return true;
			} else
				return false;
		}
		//Retrieve the attribute of specified id
		public A get (String id) {
			if (locals != null && locals.get(id) != null)
				return locals.get(id);
			else
				return globals.get(id);
		}
		//Retrieve the attribute of specified local id
		public A getLocal (String id) {
			if (locals != null)
				return locals.get(id);
			else
				return null;
		}
		//Retrieve the attribute of specified local id
		public A getGlobal (String id) {
			if (locals == null)
				return globals.get(id);
			else
				return null;
		}
		//Enter local part
		public void enterLocalScope () {
			locals = new HashMap<String,A>();
		}
		//Exit local part
		public void exitLocalScope () {
			locals = null;
		}
		// Return a textual representation of this symbol table.
		public String toString () {
			String s = "Globals: " + globals + "\n";
			if (locals != null)
				s += "Locals: " + locals + "\n";
			return s;
		}
}
