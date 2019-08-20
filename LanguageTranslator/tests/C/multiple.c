//Test functions with mupltiple parameters.

int test (int a, int b){
	int c = a+b;
	return c;
}
void pos(char a, int b, int c){
	printf(a);
}

void main (){
	pos('c',4 ,6);
    printf(test(2,3));
}