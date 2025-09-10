#include<stdio.h>
void add(int ,int);
void main(){
	int num1,num2;
	printf("enter nos :");
	scanf("%d%d",&num1,&num2);
	add(num1,num2);
}

void add(int n1 ,int n2){
	int ad=n1+n2;
	printf("addition is %d ",ad);
}

