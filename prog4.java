/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long choose(long n,long k){
        //System.out.println("n-1 = " +n + "n-k = "+k);
         
        long res = 1; 
      
        // Since C(n, k) = C(n, n-k) 
        if ( k > n - k ) 
            k = n - k; 
      
        // Calculate value of [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1] 
        for (int i = 0; i < k; ++i) 
        { 
        res *= (n - i); 
        res /= (i + 1); 
        } 
      
        return res; 
    } 
        
    
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		//BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
	//	String [] inp = br.readLine().split(" ");
		long n = sc.nextLong();
		long k = sc.nextLong();
	//	System.out.println(" n= "+n+" k= "+k);
		if(n<=k) System.out.println(1);
		else{
		    System.out.println(choose(n-1,n-k));
		}
		
		}
		sc.close();
	}
}
