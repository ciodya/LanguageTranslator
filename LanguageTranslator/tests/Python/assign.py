# /*
#  * University of Glasgow
#  * Msc Project fall, 2019
#  * Author: Yidi Cao
#  * Acknowledgement:
#  * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
#  * 
# */
# Test assignment commands.
def pos(n):
	return n

g,p,a = 7,6,True #multiple declarations, includ int and boolean variables
g = g+1 #arithmatic expression
b = 1+2*g #multiple arithmetic expression
b = a>0 #comparison expression
e = p/4-6
c = (1+2)*g #expression with brackets
d = not (g==p) #not command, with comparison expression
d = not ((g+1-4)>(p*6%5))
f = "int change to string" #string variable
f = "Hello, World.  a+b=c."
e = pos(e) #function call in assgiment command
