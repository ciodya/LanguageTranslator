// Test type checking.
int n = 'a'; //error, value 'a' is not int
_Bool c = 5; //error, value is not _Bool
_Bool pos(int n){
	return n;//error, return type conflicts with declaration
}
int fac(int n){
	return n;
}
char boo(char n){
	return n;
}
void main(){
	int i = 3;
	_Bool b = 1;
	i = i+1;
	i = b; //error, variable i has declared to be int
	i = b*2; //error, boolean variable cannot be operand of arithmatic expression
	b = i>0;
	if(b) printf(i);
	if(1) printf(i+1);
	b = pos('1'); //error, actual parameter conflict with formal parameter
	while(pos(7)){
		i = i+fac(5);
		i = i+boo('a'); //error, char variable cannot be operand of arithmatic expression
	}
}

