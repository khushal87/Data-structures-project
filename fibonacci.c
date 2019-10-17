/*to print the fibonacci series*/
#include<stdio.h>
void main()
{
    int n,i=0,j=1,k;
    printf("enter the value of n");
    scanf("%d",&n);
    for (i=0;i<n;i++)
    {
    i=j;
    j=k;
    k=i+j;
    printf("%d",k);
    }
}