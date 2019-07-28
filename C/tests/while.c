//test while-commands

void main(){
	//Read a number, and print all squares
	//up to and including that number
	int a ;
	a = gets();
	int i = 1;
	while(i*i < a+1){
		puts(i*i);
		i = i+1;
	}
}
