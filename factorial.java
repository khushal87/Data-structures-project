import java.util.*;
class ABC 
{
public static void main()
{ int fact=1;
Scanner sc=new Scanner(System.in)
System.out.println("enter a number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial is"+fact);
}
}
