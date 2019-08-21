//BY Khushal Agarwal

import java.util.Scanner;
public class sum_of_digits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        while(m>0)
        {
            int rem=m%10;
            m=m/10;
            sum+=rem;
        }
        System.out.println(sum);
    }
}

//Output :-

//1234
//10
