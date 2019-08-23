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

