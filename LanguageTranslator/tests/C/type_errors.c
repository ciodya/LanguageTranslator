// Test type checking.

int n = 'a'; //error
_Bool c = 5; //error
_Bool pos(int n){
	return n;//error
}
void main(){
	int i = 3;
	_Bool b = 1;
	i = i+1;
	i = b; //error
	i = b*2; //error
	b = i>0;
	if(b) printf(i);
	if(1) printf(i+1);
	if(i) printf(i); //error
	b = pos('1'); //error
	while(pos(7)){
		i = i+1;
	}
}
