package C;

public class Address {
	public static final int
	   CODE   = 0,
	   GLOBAL = 1,
	   LOCAL  = 2;

	public int offset;
	public int locale;  
	
	public Address (int off, int loc) {
		offset = off;  locale = loc;
	}

}
