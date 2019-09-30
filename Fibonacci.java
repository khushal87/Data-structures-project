/*
    Print first N Fibonacci numbers and their average.
    N should be command line input.
 */

// Created by akashbhalotia
import java.util.Scanner;

class Fibonacci
{
    private int a[],N;
    private double avg;

    public Fibonacci(int N) //parameterized constructor 
    {
        this.N=N;
        a=new int[this.N];
        avg=0.0;
    }
    public void solve() //solves the problem
    {
        int sum=0,i;
        a[0]=a[1]=1;

        for(i=2;i<N;i++) //finds the next Fibo number
            a[i]=a[i-1]+a[i-2];

        for(i=0;i<N;i++) //computes sum of the numbers
            sum+=a[i];

        avg=(double)(sum)/N;
    }
    public void display() //displays the answer computed
    {
        System.out.print("The first "+N+" Fibonacci numbers are: ");
        for(int i=0;i<N-1;i++)
            System.out.print(a[i]+" ");
        System.out.println(a[N-1]);

        System.out.println("The average is "+avg);
    }
}
class Solver
{
    public static void main(String[] args)
    {
        Fibonacci obj=new Fibonacci(Integer.parseInt(args[0]));
        obj.solve();
        obj.display();
    }
}
