//Check the given number is prime or not.
//Input: n = 7
//Output: Prime

void main(){
	int count=0,no,i=1;
	printf("enter any no:");
	scanf("%d",&no);
	while(i<=no){
		if(no%i==0){
			count++;
		}
		i++;
		
	}
	if(count>2){
		printf("%d is not prime",no);
	}
	else{
		printf("%d is prime",no);
	}
}
