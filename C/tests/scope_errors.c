// Test scope checking.
int y = x; //error
int x = 1;
char x = 'a'; //error
_Bool x = 1;
void test(){
	int z = 10;
}
void main(){
	int x = 0;
	int n = 0;
	int n = 1; //error
	x = x+z; //error
}

