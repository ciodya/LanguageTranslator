# Test type checking.

n = "a"
def pos(n):
    return n
def fac():
	return "s"

i = 3
b = True
i = b
i = b*2 #error
b = i>0
if b:
    i = pos(6)+1
if 1:
    i = i+fac(i) #error
if i:
    print(i)
b = pos("1") #error
while pos(7):
    i = i+1 