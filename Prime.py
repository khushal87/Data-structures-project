#Objective:To find whether a number is prime or not
#Program by:Harsh Sharma
i=2
c=None
print("Enter a number:")
n=int(input())
while i<n:
    if n%i==0:
        c=1
        break
    i+=1

if c==1:
    print("Not a prime no.")
else:
    print("Prime no.")
