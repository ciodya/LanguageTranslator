# Test scope checking.
y = x  #error, variable x is undeclared
x = 1
x = "a" #NOT error, variable type can be reassigned
def test():
    z = 10
x = z #error, variable z is used beyond its scope
print(pos()) #error, function pos() is undeclared