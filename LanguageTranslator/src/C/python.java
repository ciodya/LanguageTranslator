/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
*/

package C;

public class python {
	String allCode = "";

	public void addCode (String code) {
		allCode += code;
	}
	public void interpret (boolean tracing) {
	}
	public String showCode () {
		return allCode;
	}
}
