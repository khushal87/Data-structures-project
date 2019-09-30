/*
    Bank system
    -----------

    Info:
    1) N number of customers
    2) Deposit and withdraw operations
    3) Must be reflected in main bank balance too (balance of the bank as a whole)
    4) if after withdrawal, remaining balance is less tan 1000, then 300 Rs fine.
    5) Does customer have sufficient money to withdraw?
    6) Does bank have sufficient balance to allow that withdrawal?

    I have made a menu-driven program, though it wasn't specified.
    This can be useful in future as a template for menu-driven programs.
    You can do it without a menu too.
 */

// Created by akashbhalotia
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bank
{
    private String name;
    private int acno,cBal;
    private static int bBal;

    public Bank(String name, int acno, int cBal) //parameterized constructor
    {
        this.name=name;
        this.acno=acno;
        this.cBal=cBal;
    }
    public static void setBal(int amt) //sets the value of the static variable
    {
        bBal=amt;
    }
    public void deposit(int amt) //deposit an amount
    {
        cBal+=amt;
        bBal+=amt;
        display(3);
    }
    public void withdraw(int amt) //withdraw
    {
        if(bBal<amt) //bank has insufficient money
            display(1);
        else if(cBal<amt) //You have insufficient money
            display(2);
        else
        {
            cBal-=amt;
            bBal-=amt;

            if(cBal<1000) //fine
            {
                cBal-=300;
                bBal+=300;
                System.out.println("A fine of Rs. 300 has been charged for low balance.");
            }
        }
        display(3);
    }
    public void display(int code) //displays various messages
    {
        if(code==1)
            System.out.println("The bank has insufficient funds");
        else if(code==2)
            System.out.println("You have insufficient funds");
        else
            System.out.println("Your current balance is Rs. "+cBal);
    }
}
class Solver
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,N,acno,cBal,choice,amt;
        String name;

        System.out.println("Enter the initial amount of money that the bank has");
        Bank.setBal(Integer.parseInt(br.readLine().trim()));

        System.out.println("Enter number of customers");
        N=Integer.parseInt(br.readLine().trim());

        for(i=0;i<N;i++)
        {
            System.out.println("Enter name of customer "+(i+1));
            name=br.readLine().trim();
            System.out.println("Enter account number");
            acno=Integer.parseInt(br.readLine().trim());
            System.out.println("Enter current balance");
            cBal=Integer.parseInt(br.readLine().trim());

            Bank customer=new Bank(name,acno,cBal);

            //Menu
            do
            {
                System.out.println("1) Deposit\n2) Withdraw\n3) Exit\nEnter your choice.");
                choice = Integer.parseInt(br.readLine().trim());

                switch (choice)
                {
                    case 1:
                        System.out.println("Enter amount to deposit");
                        amt = Integer.parseInt(br.readLine().trim());
                        customer.deposit(amt);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw");
                        amt = Integer.parseInt(br.readLine().trim());
                        customer.withdraw(amt);
                        break;
                    case 3:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
            while (choice!=3);
        }
    }
}
