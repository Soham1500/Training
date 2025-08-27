//Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.

// y and price>500 dis=20% or 10%
//n price>600 dis=15% or no dis


void main(){
	float price,discountprice;
	char isstud;
	
	printf("enter price:");
	scanf("%f",&price);
		printf("are you a student:");
	scanf(" %c",&isstud);
	

	if(isstud=='y'|| isstud=="Y"){
		if(price>500){
			discountprice=price-(0.2*price);
		}
		else{
			discountprice=price-(0.1*price);
		}
		
	}
	else{
		if(price>=600){
			discountprice=price-(0.15*price);
		}
	}
	printf("discounted price = %.2f",discountprice);
}
