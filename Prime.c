#include<stdio.h>
#include<math.h>
void main()
{int i=2,n,p,c,q;
printf("Enter a number:");
scanf("%d",&n);
while(i<sqrt(n))
    {if(n%i==0)
       {c=1;
        }
     i++;
     }
if(c==1)
  {printf("Entered number is not prime");
   }
else{printf("Prime no.");
   }
}