/*to read a number from keyboard, and show it’s ASCII Equivalent symbol*/
#include<stdio.h>
void main()
{
int n;
printf("enter the number between 0 to 255");
scanf("%d",&n);
printf("the ascii equivalent of %d is %c ",n,n);
}