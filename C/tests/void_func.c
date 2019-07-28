// Test procedures.

int total = 0;

void add (int inc){
	total = total + inc;
}

void main (){
// Read numbers until a 0 is read.
// Print their total.
	int i = gets();
	while (i > 0){
		add(i);
		i = gets();
	}
	puts(total);
}
