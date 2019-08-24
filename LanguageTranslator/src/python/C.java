/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
*/

package python;

public class C {
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
