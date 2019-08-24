/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
*/
// Test functions.

int test (int n){ 
	//variable declarations in function
	int r = 10;
	char s = 's';
	char b[10] = "Hello";
	_Bool t = 0;
	//print function call in function
	printf(s);
	printf(r);
	printf(t);
	printf(b);
	return r;
 }

void main (){
	printf(test(5)); //function call
}

