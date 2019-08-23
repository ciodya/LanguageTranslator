# Test functions with multiple parameters
i = 9
def test (a,b,c): #function with multiple parameters; parameter type is set to be int by default
    n = 1
    print(a)
    print(b)
    print(c)
    return n
def pos (a:string,b:int,c:bool,d): #function with commented parameters;parameter types are set to be as comments
    n = 1
    d = n+b
    print(a)
    print(b)
    print(c)
    return d
test(4,5,6) #function test called
pos("Hi",9,True,i)#function pos called; with different types of parameters
print(test(5,8,9))