// Write a C program to convert temperature from Celsius to Fahrenheit using the
//formula:
//F = (C *9/5) + 32


void toFahern(float);

void main(){
	float temp;
	printf("enter temp :");
	scanf("%f",&temp);
	toFahern(temp);
}

void toFahern(float y){
	float fahern=(y*9/5)+32;
	printf("%.1f",fahern); 
}
