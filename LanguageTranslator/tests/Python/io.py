# /*
#  * University of Glasgow
#  * Msc Project fall, 2019
#  * Author: Yidi Cao
#  * Acknowledgement:
#  * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
#  * 
# */
# Test IO
p = input() #function input is called
a = 1
b = True
c = "Hello"
a = input() #variable can be reassigned
b = input() #variable can be reassigned
c = input() #variable can be reassigned

print(a) #print single variable
print(a,b) #print multiple variables
print(a,b,c,p)
print(3,True,"Hello",a) #print values and variables