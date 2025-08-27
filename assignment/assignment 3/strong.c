//Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong


void main(){
	int num=155,temp,rem,i,fact,sum=0;
	temp=num;
	while(num!=0){
		rem=num%10;
		num=num/10;
		fact=1;
	//	printf("%d ",rem);
		for(i=1;i<=rem;i++){
			
			fact=fact*i;
//			printf("%d ",fact);
		}
		sum+=fact;
		
	}
	if(sum==temp){
		printf("strong no");
	}
	else{
		printf("NOT SO STRONG ");
	}
	//printf("%d ",sum);
	
}
