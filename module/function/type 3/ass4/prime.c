//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
void isprime(int no){
	int count=0,i=1;
	while(i<=no){
		if(no%i==0){
			count++;
		}
		i++;
		
	}
	if(count>2){
		printf("%d is not prime",no);
	}
}
void main(){
	int no;
	printf("enter any no:");
	scanf("%d",&no);
	isprime(no);
}
