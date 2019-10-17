#include <stdio.h>
void main (int a){
int b;int c =0;
if(a==1)
{printf(" 1 is neither prime nor composite");}
else{
for(b=1;b<=a;b++){
if(a%b==0)
c++;}
if(c==2)
printf("Entered value is prime);
else
printf("Entered value is composite);
}}