//Write a C program to convert given minutes into hours and remaining minutes.

void convert_to_min(int);

void main(){
	int min;
	printf("enter total minutes: ");
	scanf("%d",&min);
	convert_to_min(min);
	
}

void convert_to_min(int min){
	int hrs=min/60;
	int m=min%60;
	printf("%d hrs and %d min",hrs,m);
}
