# test while-commands

#Read a number, and print all squares
#up to and including that numbe
a = input()
i = 1
while i*i < a+1:
	print(i*i)
	i = i+1
else:
    print(a)