/*
	Binary Search
	Assuming array is already sorted.
*/

//created by akashbhalotia
#include <stdio.h>

void input(int a[], int N) //takes array input
{
	int i;
	
	for(i=0;i<N;i++)
	{
		printf("Enter a number\n");
		scanf("%d",&a[i]);
	}
}

int binSearch(int a[], int N, int key) //binary search
{
	int l=0,r=N-1,mid;
	
	while(l<=r)
	{
		mid=(l+r)/2;
		
		if(a[mid]==key)
			return mid;
		else if(a[mid]<key)
			l=mid+1;
		else
			r=mid-1;
	}
	
	return -1;
}

int main()
{
	int i,N,key,pos;
	
	printf("Enter number of elements\n");
	scanf("%d",&N);
	
	int a[N];
	input(a,N);
	
	printf("Enter a number to be searched\n");
	scanf("%d",&key);
	
	pos=binSearch(a,N,key);
	
	if(pos==-1)
		printf("Element not present in array\n");
	else
		printf("Element found at index: %d, (0-indexed)\n",pos);
	
	return 0;
}
