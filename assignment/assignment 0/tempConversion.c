// Write a C program to convert temperature from Celsius to Fahrenheit using the
//formula:
//F = (C *9/5) + 32

void main(){
	int temp;
float fahrenheit;
	printf("enter temp:");
	scanf("%d",&temp);
	fahrenheit=(temp *9/5) + 32;
	printf("%f fahrenheit celcius",fahrenheit);
}
