/*Objective: To print fibonacci Series
 Program by : Harsh Sharma
*/
#include<stdio.h>
void main()
{ int n,i=1,j=1,k;
  printf("Enter Fibonacci limit");
  scanf("%d",&n);
  while(i<=n)
      {i=j;
       j=k;
       k=i+j;
       printf("%d",k);
       }
}