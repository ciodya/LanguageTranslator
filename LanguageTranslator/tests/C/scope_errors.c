// Test scope checking.
int y = x; //error
int x = 1;
char x = 'a'; //error
_Bool x = 1; //error
void test(){
	int z = 10;
}
int test(){ //error
	return 1;
}
void main(){
	int x = 0;
	int n = 0;
	int n = 1; //error
	x = x+z; //error
	pos(); //error
}

