# Test scope checking.
y = x;  #error
x = 1
x = "a"

def test():
    z = 10

x = 0
n = 0
n = 1
x = x+z #error