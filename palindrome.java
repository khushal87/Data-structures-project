import java.util.*;
class ABC 
{
public static void main()
{ int dg,rev=0;
Scanner sc=new Scanner(System.in)
System.out.println("enter a number");
int n=sc.nextInt(),k=n;
while(n>0)
{
dg=n%10;
rev=rev*10+dg;
n=n/10;
}
if(rev==k)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
