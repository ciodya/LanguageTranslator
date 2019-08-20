//Test IO.
int p;
scanf(p); //int variable
int pos(int a){
	return a;
}
void main(){
	char a;
	scanf(a); //char variable
	_Bool c;
	scanf(c); //boolean variable

	int b = p + 2;

	printf(a); //single variable
	printf(b,p,6); //multiple variable
	printf(a,b,c,p,6); //multiple variable include int, char, boolean
	printf('s',"Hello",9,c,a); //variables and values
	printf(pos(p), pos(8)); //function call
}

