import java.util.Scanner;
public class sum_of_n_numbers {
   public static void main(String args[])
   {
       int num;
       System.out.println("Enter number - ");
       Scanner obj=new Scanner(System.in);
       num=obj.nextInt();
       int sum=0;
       for(int i=1;i<=num;i++)
       {
           sum+=i;
       }
       System.out.println(sum);
   }
}

//Output - 
//Enter number - 
//10
//55

