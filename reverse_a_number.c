/*to reverse a number*/
#include<stdio.h>
void main()
{
    int n,i=0,r,new_number=0;
    printf("the no.");
    scanf("%d",&n);
   while (n>0)
    {
      r=n%10;
      new_number=new_number*10+r;
      n=n/10;
    }
    printf("the reversed number=%d",new_number);
    
}
