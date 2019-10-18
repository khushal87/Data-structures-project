//#include <stdio.h>
//#include <stdlib.h>
//void push(int );
//void pop();
//void display();
//int stack[10],size=10,top=-1;
//int main() {
//    int n;
//    printf("Enter size of Stack");
//    scanf("%d", &n);
//    size = n;
//    stack[n];
//    int choice;
//    do {
//        printf("Enter 1 for push and 2 for pop");
//        scanf("%d", &choice);
//        switch (choice) {
//            case 1:
//                printf("Enter Element");
//                int ele;
//                scanf("%d", &ele);
//                push(ele);
//                display();
//                break;
//            case 2:printf("Enter Element");
//                pop();
//                display();
//        }
//    }
//    while (choice==1 || choice==2);
//    return 0;
//}
//void push (int ele)
//{
//    if (top==size-1)
//        printf("Overflow");
//    else
//        stack[++top]=ele;
//}
//void pop()
//{
//    if(top==-1)
//        printf("Underflow");
//    else
//        top--;
//}
//void display()
//{
//    if(top>=0)
//    {
//        printf("\n The elements in STACK \n");
//        for(i=top; i>=0; i--)
//            printf("\n%d",stack[i]);
//    }
//    else
//    {
//        printf("\n The STACK is empty");
//    }
//}
