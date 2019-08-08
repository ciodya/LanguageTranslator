# Test functions.
# Return n!
verbose = False
def fac(n):
    f = 1
    while not n > 1:
        f = f*n
        n = n-1
    return f
# Read integers and write their factorials.
# Terminate when 0 is read.
num = input()
while num != 0:
	if verbose:
		print(num)
	print(fac(num))
	num = input()