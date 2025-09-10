// prime 

void main(){
if(isprime()==2){
	printf(" prime");
}
else{
	printf("not prime");
}
	
}
int isprime(){
	int num,i,flag=0;
	printf("enter nos :");
	scanf("%d",&num);
	for(i=1;i<=num;i++){
		if(num%i==0 && num>=2){
			flag++;
		}
	
	}
	return flag;
}
