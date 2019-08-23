/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * Representation of types.
*/

package python;

import java.util.ArrayList;

public abstract class Type {
	//Primitive type
	public static final Primitive
	   VOID = new Primitive(0),
	   STRING  = new Primitive(1),
	   INT  = new Primitive(2),
	   BOOL = new Primitive(3);
	//Sequence type
	public static final ArrayList<Type>
		SEQUENCE = new ArrayList<Type>();
	public static final Error
	   ERROR = new Error();
	public static final Sequence
	    EMPTY = new Sequence(new ArrayList<Type>());
	public static final Sequence_int
		SEQUENCE_INT= new Sequence_int(new ArrayList<Type>());
 
	public abstract boolean equiv (Type that);
	public abstract String toString ();
	//Primitive class for variable/function type
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
	//Pair type for binary operations
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
	//Sequence type
	public static class Sequence extends Type {
	public ArrayList<Type> sequence;

	public Sequence(ArrayList<Type> seq) {
	    sequence = seq;
	}
	public int size() {
	    return sequence.size();
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
	//Sequence of integer
	public static class Sequence_int extends Type { 
		public ArrayList<Type> sequence;

		public Sequence_int(ArrayList<Type> seq) {
		    sequence = seq;
		    sequence.add(INT);
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
	 //Mapping type for functions
	public static class Mapping extends Type { 
		public Type domain, range;
		public Type.Sequence domain_seq;
//		public ArrayList<Type> domain_seq;

		public Mapping (Type d, Type r) {	//single parameter
			domain = d;
			range = r;
			domain_seq = null;
		}
		public Mapping (Type.Sequence d, Type r) {	//multiple parameters
			domain = null;
			domain_seq = d;
			range = r;
		}
		public int size() {
			return domain_seq.size();
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
