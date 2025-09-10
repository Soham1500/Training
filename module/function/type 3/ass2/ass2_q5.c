//Write a program to check whether a person is eligible to vote (age = 18).

void iseligible(int age){
	age>18? printf( "eligible"):printf( "not eligible");
}

void main(){
	int age;
	printf("enter age :");
	scanf("%d",&age);
	
iseligible(age);
}
