// calculate electricity bill 
// 1-50 unit 30/unit
// 51-150 40/unit
// 151 50/unit
#include<stdio.h>
double calculateBill(int);

void main(){
	int unit;
	printf("enter unit :");
	scanf("%d",&unit);
	double totalprice=calculateBill(unit);
	printf("total price is %.2lf ",totalprice);
}

double calculateBill(int unit){
	double price=0;
	if(unit<=50){
		price=unit*30;
		return price;
	}else if(unit >50 && unit<=150){
	return	price=unit*40;
	}
	else if(unit>150){
	return	price=unit*50;
	}
	else{
		printf("enter proper unit");
	}
	return 0;
}
