// Test functions.
_Bool verbose = 0;
int fac (int n){  // Return n!
	int f = 1;
	while( n > 1){
		f = f*n ;
		n = n-1 ;
	}
	return f ;
}

void main (){
// Read integers and write their factorials.
// Terminate when 0 is read.
	int num = gets();
	while (num != 0){
		if (verbose) puts(num);
		puts(fac(num));
		num = gets() ;
	}
}

