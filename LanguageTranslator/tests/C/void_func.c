/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
*/
// Test void functions.

int total = 0;
int pos(int a){
	return a;
}
void add (int inc){
	inc = inc + pos(5); //function call
	total = total + inc; //assignment command
}
void main (){
	int i ;
	scanf(i);
	while (i > 0){
		add(i); //function call
		scanf(i);
	}
	printf(total);
}
