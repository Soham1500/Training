//Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50
#include<stdio.h>
int main(){
	int no,i=1;
	printf("enter a number :");
scanf("%d",&no);
	while(i<=10){
		printf("%d X %d =%d \n",no,i,(no*i));
		i++;
	}
	return 0;
}
