//By KHUSHAL AGARWAL
import java.util.Scanner;
public class fibonacci_average {
    int fibonacci(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number - ");
        fibonacci_average fa=new fibonacci_average();
        int n=obj.nextInt();
        int sum=0;
        System.out.println("Series is - ");
        for(int i=0;i<n;i++)
        {
            int num=fa.fibonacci(i);
            sum+=num;
            System.out.print(num+"   ");
        }
        System.out.println();
        System.out.println("Average is - ");
        System.out.println(sum/n);
    }
}


//Output
//Enter number - 
//10
//Series is - 
//0   1   1   2   3   5   8   13   21   34   
//Average is - 
//8
