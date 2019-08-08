// Test functions.
_Bool verbose = 0;
int fac (int n){  // Return n!
	int f = 1;
	while( n > 1){
		f = f*n ;
		n = n-1 ;
	}
	if( f == 1)
		f = 2;
	else
		f = 3;
	return f ;
}

void main(){
// Read integers and write their factorials.
// Terminate when 0 is read.
	int num ;
	scanf(num);
	while (num != 0){
		if (verbose) printf(num);
		printf(fac(num) + 1);
		scanf(num);
	}
}

