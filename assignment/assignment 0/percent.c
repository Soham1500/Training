//Write a C program to input marks of five subjects, find the total marks, and calculate
//the percentage.

void main(){
	int history=90,english=80,marathi=85,science=85,maths=93;
	float totalmks=history+english+marathi+science+maths;
	printf("%f",totalmks);
	float per=(totalmks/500)*100;
	printf("percentage are:%.2f",per);
}
