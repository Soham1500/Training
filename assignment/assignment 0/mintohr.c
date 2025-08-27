//Write a C program to convert given minutes into hours and remaining minutes.

void main(){
	int min;
	printf("enter minutes:");
	scanf("%d",&min);
	int hr=min/60;
int remmin=min%60;
	printf("%d minutes in %d hrs and %d min",min,hr,remmin);
}
