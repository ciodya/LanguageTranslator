//test while-commands

void main(){
	//Read a number, and print all squares
	//up to and including that number
	int a ;
	scanf(a);
	int i = 1;
	while(i*i < a+1){
		printf(i*i);
		i = i+1;
	}
}
