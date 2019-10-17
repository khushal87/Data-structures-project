/*Write a menu driven program for banking to deposit amount, withdraw amounts, computes the interest and compute the balance based on the user inputs*/
#include<stdio.h>
void main()
{
    double amt, rate, deposit, withdraw, interest;
    char bnk;
    int t;
    printf("enter to perform operation");
    scanf("%ch",&bnk);
    printf("enter the amount");
    scanf("%lf",&amt);
    switch(bnk)
    {
        case 'd':
        
        printf("enter the amount to be deposited");
        scanf("%lf",&deposit);
        amt=amt+deposit;
        printf("amount after deposit=%lf",amt);
        break;
        case 'w':
        
        printf("enter the amount to be withdrawn");
        scanf("%lf",&withdraw);
        amt=amt-withdraw;
        printf("amount after withdraw=%lf",amt);
        break;
        case 'i' :
        
        printf("enter the rate and time at which interest is to be calculated ");
        scanf("%lf %d",&rate,&t);
        interest=(amt*rate*t)/100;
        amt=amt+interest;
        printf("amount after applying interest=%lf",amt);
        break;
        default: 
        printf("wrong choice");
        
        
        
    }
}