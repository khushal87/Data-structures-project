import java.util.*;
class ABC 
{
public static void main()
{
Scanner sc=new Scanner(System.in)
System.out.println("enter a number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c==2)
System.out.println("prime num");
else 
System.out.println("not a prime");
}
}

