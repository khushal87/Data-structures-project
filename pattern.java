import java.util.*;
class ABC 
{
public static void main()
{
Scanner sc=new Scanner(System.in)
System.out.println("enter a number");
int n=sc.nextInt();
for (int i=1;i<=n;i++)
{
for ( int j=n;j>=i;j--)
{
System.out.print(i+"\t");
}
System.out.println();
}
}
}
