/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
*/
// Test scope checking.
int y = x; //error, variable x is undeclared
int x = 1;
char x = 'a'; //error, x redeclared with type char
_Bool x = 1; //error, x redeclared with type _Bool
void test(){
	int z = 10;
}
void test(){ //error, function test is redeclared
	int z = 5;
}
int test(){ //error, function test is redeclared with return type int
	return 1;
}
void main(){
	int x = 0;
	int n = 0;
	int n = 1; //error, variable n is redeclared
	x = x+z; //error, global variable z is used beyong its scope
	pos(); //error, function pos() is undeclared before called
}