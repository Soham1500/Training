//Print armstrong numbers in the given range 1 to n.
#include <math.h>
void main(){
	int i,no,temp,rem,sum=0,po;
	printf("enter a no:");
	scanf("%d",&no);
	for(i=1;i<=no;i++){
	
	if(no<10){
		po=1;
	}
	else if(no<100){
		po=2;
	}
	else if(no<1000){
		po=3;
	}
	else{
		printf("bss bro");
	}
	temp=no;
	while(i!=0){
		rem=i%10;
		i=i/10;
		sum=sum+pow(i,po);
	}
	printf("%d ",sum);
}}
