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
}
