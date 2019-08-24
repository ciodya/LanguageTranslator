# /*
#  * University of Glasgow
#  * Msc Project fall, 2019
#  * Author: Yidi Cao
#  * Acknowledgement:
#  * This file is partly based on the Fun Compiler at https://moodle.gla.ac.uk/course/view.php?id=903
#  * 
# */
# Test void functions
total = 0
def add (inc): #void function with single parameter
    total = total + inc

def pos(): #void function with no parameter
    total = True

def fac(a,b): #void function with multiple parameters
    total = a+b

i = input()
pos() #function pos called
fac(9,19) #function fac called
print(total)
while i > 0:
    add(i) #function add called
    i = input()

