//Write a C program to swap two numbers using a temporary third variable.

void main (){
	int a=10,b=20,temp;
	temp=a;
	a=b;
	b=temp;
	
	printf("value of a is %d and value of b is %d",a,b);
}
