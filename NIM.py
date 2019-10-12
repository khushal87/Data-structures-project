print("T H E  G A M E  O F  N I M")


# function to take valid input of remove stone
def take_input():
    while True:
        x = int(input("How many would you like to remove - 1 or 2? "))
        if(x>=1 and x<=2 and x <= stone_left):
            return x
        else:
            print("you cannot remove ",x," stones")
            
# function to take valid input of initail stone
def take_intial_input():
    while True:
        x = int(input("Enter the number of starting Stones: "))
        if(x>0):
            return x
        else:
            print("You cannot start with ",x," stones.")


while True:
    no = take_intial_input()
    chance_start = input("Would you like to go first?(y/n) ")
    stone_left = no
    if(chance_start.capitalize() == "Y" or chance_start.capitalize() == "Yes"):
        #if player turns first
        while True:
            #player Turn code
            remove = take_input()
            stone_left -= remove
            print("The number of stone left is ", stone_left)

            
            if(stone_left == 0):
                print("The computer wins!")
                break;

            #Computer Turn Code
            if(stone_left%3 == 0):
                stone_left -= 2
                print("The computer removes 2 Stones")
                print("The number of stone left is ", stone_left)
            
            else:
                stone_left -= 1
                print("Computer removed 1 stones left is ",stone_left)
                print("The number of stone left is ", stone_left)

            if(stone_left == 0):
                
                print("you win!")
                break;

    #if computer turns first        
    else:
        while True:
            
            #Computer Turn Code
            if(stone_left%3 == 0):
                stone_left -= 2
                print("The computer removes 2 Stones")
                print("The number of stone left is ", stone_left)
                
            else:
                stone_left -= 1
                print("Computer removed 1 stones left is ",stone_left)
                print("The number of stone left is ", stone_left)

            if(stone_left == 0):
                    
                print("You wins!")
                break
            
            #player Turn code
            remove = take_input()
            stone_left -= remove
            print("The number of stone left is ", stone_left)

            
            if(stone_left == 0):
                print("The computer wins!")
                break
        
        

    

#Ask to play again
    again = input("Do you want to play again? ")
    if(again.capitalize() == "Yes" or again == "y" or again == "Y"):
        continue;
    else:
        break;

    

        
        
        
    
