//Object code of assign.py
void main(){ 
	int pos(int n){ 
		return n; 
	}
	int  g = 7; 
	int  p = 6; 
	_Bool  a = 1; 
	g = g+1; 
	int  b = 1+2*g; 
	b = a>0; //error, as variable b has been declared to be int
	int  e = p/4-6; 
	int  c = (1+2)*g; 
	_Bool  d = !(g==p); 
	d = !((g+1-4)>(p*6%5)); 
	char f[]  = "int change to string"; 
	f = "Hello, World.  a+b=c."; 
	e = pos(e); 
}