#include<stdio.h>
#include<math.h>
void main()
{
    float  l,a,b,x,y;
    printf("enter the value of cocordinates");
    scanf("%f %f %f %f" ,&a,&b,&x,&y);
    l=sqrt(pow((a-b),2)+pow((x-y),2));
    printf("the distance between the points =%f",l);
}
    
    