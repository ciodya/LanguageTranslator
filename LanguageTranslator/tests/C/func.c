/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * Acknowledgement:
 * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
 * 
*/
// Test functions.
_Bool verbose = 0;
int fac (int n){  
	int f = 1; //assignment command in function
	while( n > 1){ //while statement in function
		f = f*n ;
		n = n-1 ;
	}
	if( f == 1) //if-else statement in function
		f = 2;
	else
		f = 3;
	return f ;
}

void main(){
	int num ;
	scanf(num);
	int a = fac(5); //assignment command with function call
	while (num != 0){
		if (verbose) printf(num);
		printf(fac(num) + a);
		scanf(num);
	}
}

