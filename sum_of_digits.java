/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab122
 */
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
            int rem=m/10;
            m=m/10;
            sum+=rem;
        }
        System.out.println(sum);
    }
}
