// Write a C program to input five numbers and find their average.

void main (){
	int a,b,c,d,e;
	float avg;
	printf("enter 5 no's:");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	avg=(a+b+c+d+e)/5;
	printf("average is %f",avg);
}
