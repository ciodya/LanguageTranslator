# Test type checking.
def pos(n):
    return n
def fac():
	return "s"

i = 3
b = True
i = b
i = b*2 #error, boolean variable cannot be operand of arithmatic expression
i = False+1 #error, boolean value cannot be operand of arithmatic expression
i = "Hello"/2 #error, string value cannot be operand of arithmatic expression
i = 2,3 #error,disparity of values and variables
if b:
    i = pos(6)+1
if 1:
    i = i+fac() #error, string variable cannot be operand of arithmatic expression
    i = fac(b)  #error, fac() do not have parameters           
if i: #string variable cannot be the condition of if-else statement
    print(i)
while i: #string variable cannot be the condition of while statement
    print(i)
b = pos("1")
b = pos() #error, there should be parameters
b = pos(3,5,6) #error, there should be only one parameter
while pos(7):
    i = 1 
