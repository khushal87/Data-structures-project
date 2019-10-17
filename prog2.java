/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	
	 
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter( new BufferedOutputStream(System.out));
		int testcase = Integer.parseInt(in.readLine());
		while(testcase-->0){
			int n = Integer.parseInt(in.readLine());
			int ans = 0;
			int k=5;
			
			// K will eventually be greater than n at some point of time
			while(n/k>0){
				ans+=n/k;
				k*=5;
			}
			out.println(ans);
		}
		in.close();
		out.close();
	}

	
}
