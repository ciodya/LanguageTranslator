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
	if(a > 0)
		printf(a);
	if(a < b){
		pos(8);
		a = a + 1;
		printf(a);
		}
	else{
		b = b + fac('s');
		printf(b);
		}
}

