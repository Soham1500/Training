//Write a C program to input marks of five subjects, find the total marks, and calculate
//the percentage.
void calculate_percent(float totalmks);

void main(){
	int s1,s2,s3,s4,s5;
	float totalmks;
	printf("enter marks of subjects from 100:");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	totalmks=(s1+s2+s3+s4+s5);
	calculate_percent(totalmks);
}

void calculate_percent(float totalmks){
	float percent=(totalmks/500)*100;
	printf("percent is %f ",percent);
	
}
