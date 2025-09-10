//Write a C program to input marks of five subjects, find the total marks, and calculate
//the percentage.
float calculate_percent(float totalmks);

void main(){
	int s1,s2,s3,s4,s5;
	float totalmks;
	printf("enter marks of subjects from 100:");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	totalmks=(s1+s2+s3+s4+s5);
	
	printf("percent is %.1f ",calculate_percent(totalmks));
}

float calculate_percent(float totalmks){
return (totalmks/500)*100;
	
	
}
