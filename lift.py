print("Welcome to Charan MIT191530's elevator simulator!")

current_floor = 1
#function to move lift up or down
def move(new_floor):
    global current_floor
    global moving_print
    
    # when lift goes down
    if(new_floor<current_floor):
        moving = []
        moving.append("Going down")        
        for x in range(current_floor-1,new_floor-1,-1):
            moving.append(x)
        moving.append("Ding!")    
        print("...".join(str(x) for x in moving))        
        current_floor = new_floor

    # when lift goes up
    if(new_floor>current_floor):
        moving = []        
        moving.append("Going up")       
        for x in range(current_floor+1,new_floor+1):
            moving.append(x)
        moving.append("Ding!")    
        print("...".join(str(x) for x in moving))    
        current_floor = new_floor

check = True

#Main menu selection
while check:
    choose = input("Option: (s)elect a floor, (f)ire alarm , q(iut) ")

    if(choose == "s"):
        f = int(input("Enter the floor you'd like to go ==> "))
        
        if(f>=1 and f <=100):
            move(f)
        else:
            print("Invalid floor selection- must be between 1 and 100")
                
    #In case of fire lift goes down to 1        
    elif(choose == "f"):
        print("Danger! you must exit the building now!")
        move(1)
        
    elif(choose == "q"):
        check = False

    else:
        print("Inavalid selection.")
        

        


