//Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.

void main(){
	int basicSalary=5000;
	float totalSalary,da,ta,hra;
	if(basicSalary){
		if(basicSalary<=5000){
			da=0.1*basicSalary;
			ta=0.2*basicSalary;
			hra=0.25*basicSalary;
			totalSalary=basicSalary+da+ta+hra;
			printf("total Salary is %.2f",totalSalary);
		}
		else{
			da=0.15*basicSalary;
			ta=0.25*basicSalary;
			hra=0.30*basicSalary;
			totalSalary=basicSalary+da+ta+hra;
			printf("total Salary is %.2f",totalSalary);
			
		}
		
	}
	else{
		printf("enter valid salary");
	}
}
