//Write a program to check whether a given year is a leap year.

void isleap(int y){
	if(y%4==0 && y%100==0 || y%400==0){
		printf("%d year is leap ",y);
	}
	else{
		printf("%d is not leap",y);
	}
	
}


void main(){
	int year;
	printf("enter the year :");
	scanf("%d",&year);
	isleap(year);
	
}
