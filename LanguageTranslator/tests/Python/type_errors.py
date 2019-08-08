# Test type checking.

n = "a"
def pos(n):
    return n

i = 3
b = True
i = i+1
i = b
i = b*2 #error
b = i>0
if b:
    print(i)
if 1:
    print(i+1)
if i:
    print(i)
b = pos("1") #error
while pos(7):
    i = i+1 