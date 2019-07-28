package python;

import java.util.ArrayList;

public abstract class Type {
	public static final Primitive
	   VOID = new Primitive(0),
	   STRING  = new Primitive(1),
	   INT  = new Primitive(2),
	   BOOL = new Primitive(3);
	
	
	public static final ArrayList<Type>
		SEQUENCE = new ArrayList<Type>();

	public static final Error
	   ERROR = new Error();

	public static final Sequence
	    EMPTY = new Sequence(new ArrayList<Type>());
 
	public abstract boolean equiv (Type that);

	public abstract String toString ();

	public static class Primitive extends Type {
		public int which;

		public Primitive (int w) {
			which = w;
		}

		public boolean equiv (Type that) {
			return (that instanceof Primitive
			   && this.which ==
			       ((Primitive)that).which);
		}

		public String toString () {
			switch (which) {
				case  0: return "void";
				case  1: return "string";
				case  2: return "int";
				case  3: return "bool";
			}
			return "???";
		}

	}

	////////////////////////////////////////////////////////

	public static class Pair extends Type {
		public Type first, second;

		public Pair (Type fst, Type snd) {
			first = fst;
			second = snd;
		}

		public boolean equiv (Type that) {
			if (that instanceof Pair) {
				Pair thatPair = (Pair)that;
				return this.first.equiv(thatPair.first)
				   && this.second.equiv(thatPair.second);
			} else
				return false;
		}

		public String toString () {
			return first + " x " + second;
		}

	}

 ////////////////////////////////////////////////////////////

	public static class Sequence extends Type { //an expression
	public ArrayList<Type> sequence;

	public Sequence(ArrayList<Type> seq) {
	    sequence = seq;
	}

	public boolean equiv(Type that) { //check whether equivalent
	    if (that instanceof Sequence) {
		ArrayList<Type> thatSequence = ((Sequence)that).sequence;
		if (thatSequence.size() != sequence.size()) //check length 
		    return false;
		for (int i = 0; i < thatSequence.size(); i++) //check content 
		    if (!(thatSequence.get(i).equiv(sequence.get(i))))
			return false;
		return true;
	    }
	    else
		return false;
	}

	public String toString() {
	    String s = "[";
	    if (sequence.size() > 0) {
		s = s + sequence.get(0);
		for (int i = 1; i < sequence.size(); i++)
		    s = s + "," + sequence.get(i);
	    }
	    s = s + "]";
	    return s;
	}
 }

	////////////////////////////////////////////////////////

	public static class Mapping extends Type { //Type of a function
		public Type domain, range;
		public ArrayList<Type> domain_seq;

		public Mapping (Type d, Type r) {
			domain = d;
			range = r;
		}
		
		public Mapping (ArrayList<Type> d, Type r) {
			domain_seq = d;
			range = r;
		}

		public boolean equiv (Type that) {
			if (that instanceof Mapping) {
				Mapping thatMapping =
				   (Mapping)that;
				if(this.domain != null)
					return this.domain.equiv(
				          thatMapping.domain)
				   && this.range.equiv(
				          thatMapping.range);
				else {
					return this.domain_seq.equals(
					          thatMapping.domain_seq)
					   && this.range.equiv(
					          thatMapping.range);
				}
			} else
				return false;
		}

		public String toString () {
			if(this.domain != null)
				return domain + " -> " + range;
			else
				return domain_seq + " -> " + range;
		}

	}

	////////////////////////////////////////////////////////

	public static class Error extends Type {

		public Error () {
		}

		public boolean equiv (Type that) {
			return true;
		}

		public String toString () {
			return "Error"; //Error message
		}

	}

}
