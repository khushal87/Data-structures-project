#Objective:To calculate Internet bill
#Program by : Harsh Sharma
print("Enter Internet Usage:")
usage=int(input())
if usage in (0,100):
    bill=200
elif usage in (101,150):
    bill=200+((usage-100)*0.60)
elif usage in (151,200):
    bill=200+(50*0.60)+((usage-150)*0.50)
else:bill=200+(50*0.60)+(50*0.50)+((usage-200)*0.40)
print(f"Internet bill = {bill}")
