# Test procedures.
total = 0
def add (inc):
    total = total + inc

# Read numbers until a 0 is read.
# Print their total.
i = input()
while i > 0:
    add(i)
    i = input()

print(total)