// Test assignment commands.
int fac(int n){
	return n;
}
void main(){
	int g,e; //multiple variable declaration in one line
	e = 3; //value assignment
	g = g+1; //arithmetic expression
	g = 1+2*g,e = e/3-4; //multiple arithmetic expression
	g = (1+2)*g; //expression containing brackets
	_Bool p = 0; //Boolean variable
	char c = 'c'; //char variable
	char a[50] = "Hello,World.  a+b=c.", b[20] = "(hello).**";   //sequences of characters
	int f = 1, k = 2; //multiple declaration with value assignment
	_Bool d = (f>(k+3*6)); //comparison expression with brackets
	e = g+fac(e); //function call assignment
	printf(g);
}
