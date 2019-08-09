//BY KHUSHAL AGARWAL
import java.util.Scanner;
public class Sum_of_harmonic_series {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input - ");
        float sum1=0,sum2=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum1+=(1.0/i);
        }
        for(int j=n;j>=1;j--)
        {
            sum2+=(1.0/j);
        }
        System.out.println(sum2-sum1);
    }
}

//Output - 
//Enter input - 
//5000
//-4.7683716E-6