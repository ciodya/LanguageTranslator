# /*
#  * University of Glasgow
#  * Msc Project fall, 2019
#  * Author: Yidi Cao
#  * Acknowledgement:
#  * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
#  * 
# */
# Test while-else commands
a = input()
i = 1
def fac(a,b):
	i = b+1+a
	return i
while i*i < a+1: #comparison expression as condition
	a = fac(a,9) #function called in while statement
	if a>10: #if-elif-else statement in while statement
		print(i*i)
	elif a == 10:
		print(a)
	else:
		print(a+1)
	i = i+1
else:
    def pos(a): #function declared in while statement
		return a+i
	print(pos(8))

while fac(i,a): #function call as condition
	print(a)