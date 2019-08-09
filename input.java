//By KHUSHAL AGARWAL
import java.util.Scanner;
public class input 
{
   int getInput()
   {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter number - ");
       int num=obj.nextInt();
       return num;
   }
   void check(int n)
   {
       if(n%2==0)
       {
           System.out.println("Even number");
       }
       else
       {
           System.out.println("Odd number");
       }
   }
   public static void main(String args[])
   {
       input obj=new input();
       int check=obj.getInput();
       obj.check(check);
       
   }
}

//Output -
//Enter number - 
//10
//Even number
