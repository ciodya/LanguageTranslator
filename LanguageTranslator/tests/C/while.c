//Test while-commands
int pos(int a){
	return a;
}

void main(){
	int a ;
	scanf(a);
	int i = 1;
	char c = 's';
	while(i*i < a+1){ //condition with comparison&arithmatic expression
		printf(i*i); //print function called in while statement
		i = i+1; //assignmeng command in while 
	}
	while(c != 'a'){ //condition with char variable&comparison expression
		int b = pos(8); //function call and assignment command
		int num;
		scanf(num); //scanf function called in while
	}
}
