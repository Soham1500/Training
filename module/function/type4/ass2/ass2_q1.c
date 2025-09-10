//Write a program to check whether a number is even or odd.

char* isEven(int no){
	return no%2==0?"%d is even",no :"%d is odd",no;
	
}

void main(){
	int num;
	printf("enter no :");
	scanf("%d",&num);
	printf("%s",isEven(num));
}
