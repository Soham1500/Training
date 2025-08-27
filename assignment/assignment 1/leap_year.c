// Write a program to check whether a given year is a leap year
void main(){
	int year =2004;
	if(year%4==0 && year%100!=0 || year%400==0){
		printf("%d year is leap year",year);
	}
	else{
		printf("%d year is not year",year);
	}
}
