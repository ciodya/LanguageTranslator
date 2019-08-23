# test if-commands
a = 8
b = a-2
def pos():
    return b
if a > 5: #comparison expression as condition
    print(a)
elif a: #int variable as condition
   a = a + 1
   def test(): #local function defined in else-if statement
       return a
   print(test()) #function called in else-if statement
elif a == 8: #there can be multille else--if statement
    while a < 9: #while statement in else-if statement
        a = a+1
    print(a)
else:
    b = b + 1
    print(pos()) #global function called in else statement

