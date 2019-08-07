// Test procedures.

int total = 0;

void add (int inc){
	total = total + inc;
}

void main (){
// Read numbers until a 0 is read.
// Print their total.
	int i ;
	scanf(i);
	while (i > 0){
		add(i);
		scanf(i);
	}
	printf(total);
}
