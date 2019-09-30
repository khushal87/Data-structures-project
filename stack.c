//created by akashbhalotia
#include<stdio.h>
#include<stdlib.h>

int isEmpty;

struct stack
{
	int data;
	struct stack *next;
} *top;

void push(int data)
{
	struct stack *newNode=(struct stack*)malloc(sizeof(struct stack*));
	isEmpty=0;
	
	newNode->data=data;
	newNode->next=top;
	top=newNode;
	
	printf("%d inserted.\n",data);
}
int pop()
{
	int data;
	if(top==NULL)
	{
		printf("Stack underflow!\n");
		data=-1;
		isEmpty=1;	
	}
	else
	{
		struct stack *tmp=top;
		top=top->next;
		data=tmp->data;
		
		free(tmp);
	}
	
	return data;
}
void printStack()
{
	struct stack *tmp=top;
	
	if(top==NULL)
		printf("Stack is empty.");
	while(tmp!=NULL)
	{
		printf("%d->",tmp->data);
		tmp=tmp->next;
	}
	printf("\n");
}
int main()
{
	int choice, data;
	top=NULL;
	
	isEmpty=1;
	
	do
	{
		printf("\nMENU:\n");
		printf("1)Push\n2)Pop\n3)Print Stack\n4)Exit\n");
		printf("Enter your choice.\n");
		
		scanf("%d",&choice);
		
		switch(choice)
		{
			case 1: 
			printf("Enter a number\n");
			scanf("%d",&data);
			push(data);
			break;
			
			case 2:
			data=pop();
			if(!isEmpty)
				printf("%d deleted.\n",data);
			break;
			
			case 3:
			printStack();
			break;
			
			case 4:
			printf("Goodbye!\n");
			break;
			
			default:
			printf("Invalid choice!\n");
		}
	}
	while(choice!=4);
	
	return 0;
}
