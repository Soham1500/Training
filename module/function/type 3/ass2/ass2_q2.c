//Write a program to check given 3 digit number is pallindrome or not.


void checkPalindrone(int num);
void main(){
	int num;
	printf("enter number ");
	scanf("%d",&num);
	checkPalindrone(num);
	
}

void checkPalindrone(int num){
	int rem,no,oldno;
	oldno=num;
	while(num!=0){
		rem=num%10;
		num=num/10;
		no=no*10+rem;
		
	}
	if(oldno==no){
		printf("palindone");
	}
	else{
		printf("not palindrone");
	}
}
