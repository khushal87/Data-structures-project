/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


	class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc =  new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int a = sc.nextInt();
	        int[] arr = new int[a+5];
	        for(int l=0;l<5;l++)
	        {
	            arr[l]=Integer.MAX_VALUE;
	        }
	        for(int j=5;j<a+5;j++)
	        {
	            arr[j]=sc.nextInt();
	        }
	        int count = 0;
	        for(int k=5;k<a+5;k++)
	        {
	            if((arr[k]<arr[k-1])&&(arr[k]<arr[k-2])&&(arr[k]<arr[k-3])&&(arr[k]<arr[k-4])&&(arr[k]<arr[k-5]))
	            {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
	}
}
	

