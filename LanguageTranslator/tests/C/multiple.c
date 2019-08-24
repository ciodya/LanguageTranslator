/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
*/
//Test functions with mupltiple parameters.

int test (int a, int b){//non-void function with multiple parameters
	int c = a+b;
	return c;
}
void pos(char a, int b, int c){ //void function with multiple parameters
	printf(a);
}

void main (){
	pos('c',4 ,6); //function pos called
    printf(test(2,3)); //function test called; function called in another function
}