//Write a C program to find the square and cube of a given number.

int sq(int);
int cb(int);

void main(){
	int s;
	printf("enter side :");
	scanf("%d",&s);
	
	printf("%d",sq(s));
	printf("%d",cb(s));
}

int sq(int a){
	return a*a;

}

int cb(int a){
	return a*a*a;
	
}
