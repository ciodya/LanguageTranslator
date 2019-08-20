// Test scope checking.
int y = x; //error, undeclared variable x
int x = 1;
char x = 'a'; //error, redeclared variable
_Bool x = 1; //error, redeclared variable
void test(){
	int z = 10;
}
int test(){ //error, redeclared function
	return 1;
}
void main(){
	int x = 0;
	int n = 0;
	int n = 1; //error, redeclared variable
	x = x+z; //error, undeclared global variable z
	pos(); //error, undelared function call
}

