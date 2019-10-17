/*to check whether the triangle is equilateral scalene or isosceles*/
#include<stdio.h>
void main()
{
    int a,b,c;
    printf("enter the sides of triangle");
    scanf("%d %d %d",&a,&b,&c);
    if (a+b>c||a+c>b||b+c>a)
    {
        if (a==b&&b==c&&c==a)
        printf("the triangle is equilateral");
        else if (a==b||b==c||c==a)
        printf("the triangle is isosceles");
        else
        printf("triangle is scalene");
        }
        else 
        printf("it is not a triangle");
    
}