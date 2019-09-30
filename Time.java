/*
    Time program to add two times in hours, minutes and seconds.
    Use concept of:
    1) Object as an argument,
    2) Object as a return type.
 */

// Created by akashbhalotia
import java.util.Scanner;
class Time
{
    private int hour,min,sec;

    public Time(){} //default constructor
    public Time(int hour, int min, int sec)//parameterised constructor
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public Time add(Time a, Time b) //Object as an argument
    {
        Time tmp=new Time();

        tmp.sec=a.sec+b.sec;
        tmp.min=a.min+b.min;
        tmp.hour=a.hour+b.hour;

        tmp.min+=tmp.sec/60;
        tmp.sec%=60;

        tmp.hour+=tmp.min/60;
        tmp.min%=60;

        return tmp; //return resulting object
    }
    public void display() //to display data
    {
        System.out.println("The total time is: ");
        System.out.println("Hours = "+hour);
        System.out.println("Minutes = "+min);
        System.out.println("Seconds = "+sec);
    }
}
class Solver
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hour,min,sec;

        System.out.println("Entering time 1...");
        System.out.println("Enter number of hours");
        hour=sc.nextInt();
        System.out.println("Enter number of minutes");
        min=sc.nextInt();
        System.out.println("Enter number of seconds");
        sec=sc.nextInt();
        System.out.println();

        Time t1=new Time(hour,min,sec);

        System.out.println("Entering time 2...");
        System.out.println("Enter number of hours");
        hour=sc.nextInt();
        System.out.println("Enter number of minutes");
        min=sc.nextInt();
        System.out.println("Enter number of seconds");
        sec=sc.nextInt();
        System.out.println();

        Time t2=new Time(hour,min,sec);

        Time t3=new Time();
        t3=t3.add(t1,t2);
        t3.display();
    }
}
