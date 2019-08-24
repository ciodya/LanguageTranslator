# /*
#  * University of Glasgow
#  * Msc Project fall, 2019
#  * Author: Yidi Cao
#  * Acknowledgement:
#  * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
#  * 
# */
# Test functions.
verbose = False
def fac(n): #function including while statement and assignment
    f = 1
    while not n > 1:
        f = f*n
        n = n-1
    return f

def pos(n:bool): #function with commented parameter and if-else statement;
                #can be used to explicitly define the type of parameters
                #if not keyword,parameter will be set to be 'int' by default
    if n>2:
        n = 1
    else:
        n = 3
    return n

num = input() #input function called
fac(2) #fac function called
pos(4) #pos function called

while num != 0:
	if verbose:
		print(num) #print function called
	print(fac(num)) #fac function called within print and while statement
print(pos(num)) #pos function called within print  and while statement
fac(pos(8)) #pos function called within fac function
num = input()