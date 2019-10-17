/*to check if the number is palindrome or not*/
#include<stdio.h>
void main()
{
    int n,r,i,new_number,m;
    printf("enter the value of n");
    scanf("%d",&n);
    while(n>0)
    {
        r=n%10;
        new_number=new_number*10+r;
        n=n/10;
    }
    if(m==n)
    printf("the number %d is palindrome",n);
    else
    printf("the number %d is not a palindrome",n);
    
}