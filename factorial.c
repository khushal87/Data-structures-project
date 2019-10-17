#include<stdio.h>
void main(int num)
{
int fact =1;
for(int i=1;i<=num;i++)
{
fact = fact * i;
}
printf("The factorial is: %d ",fact);
}