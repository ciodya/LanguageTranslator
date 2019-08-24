/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
*/
//Test if-commands.
void pos(int a){
	printf(a);
}
int fac(char c){
	printf(c);
	return 1;
}
void main(){
	int a = 8;
	int b = a-2;
	if(a > 0) //if statement with single line
		printf(a);//print called in if statement
	else //else statement with single line
		printf(b);
	if(a < b){ //if statement with code block
		pos(8); //function called in if statement
		a = a + 1; //assignment command in if statement
		printf(a);
		}
	else{ //else statement with code block
		b = b + fac('s'); //function called in else statement
		printf(b);//print called in if statement
		}
}

