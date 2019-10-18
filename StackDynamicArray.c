//#include <stdio.h>
//#include <stdlib.h>
//void push(int ,int* ,int ,int *);
//int pop(int *);
//void display(int *,int *);
//int main(){
//    int top=-1,size;
//    int n;
//    printf("Enter size of Stack");
//    scanf("%d", &n);
//    size = n;
//    int *stack;
//    stack=(int *)malloc(n* sizeof(int));
//    int choice;
//    do {
//        printf("Enter 1 for push and 2 for pop");
//        scanf("%d", &choice);
//        switch (choice) {
//            case 1:
//                printf("Enter Element");
//                int ele;
//                scanf("%d", &ele);
//                push(ele,&top,size,stack);
//                display();
//                break;
//            case 2:
//                top=pop(&top);
//                display(top,stack);
//                break;
//        }
//    }
//    while (choice!=0);
//    return 0;
//}
//
//void push(int ele,int *top,int size,int *s)
//{
//    if (*top==size-1)
//        printf("Overflow");
//    else{
//        *(s+(++*top))=ele;
//    }
//}
//
//int  pop(int *t )
//{
//    if(*t==-1) {
//        printf("Underflow");
//    }
//    else {
//        return t--;
//
//    }
//}
//
//void display(int *top,int *s)
//{
//    if(*top>=0)
//    {
//        printf("\n The elements in STACK \n");
//        for(int i=top; i>=0; i--)
//            printf("\n%d",*(s+i-1));
//    }
//    else
//    {
//        printf("\n The STACK is empty");
//    }
//}
