//Write a program to check given 3 digit number is pallindrome or not.

void main(){
	int num=101,n1,n2,n3,revno,num1;
	num1=num;
    n1=num1%10;
	num1=num1/10;
	n2=num1%10;
	num1=num1/10;
	n3=num1;
	
	revno=n1*100+n2*10+n3;
	
	if(num==revno){
		printf("number is palindrone ");
	}
	else{
		printf("number is not palindrone ");
	}
	
}
