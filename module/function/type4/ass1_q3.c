// Write a C program to convert temperature from Celsius to Fahrenheit using the
//formula:
//F = (C *9/5) + 32


float toFahern(float);

void main(){
	float temp;
	printf("enter temp :");
	scanf("%f",&temp);
	printf("%.1f",toFahern(temp));
}

float toFahern(float y){
	 return (y*9/5)+32;
 
}
