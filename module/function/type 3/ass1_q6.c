//Write a C program to find the square and cube of a given number.

void sq(int);
void cb(int);

void main(){
	int s;
	printf("enter side :");
	scanf("%d",&s);
	
	sq(s);
	cb(s);
}

void sq(int a){
	int res=a*a;
	printf("%d\n",res);
}

void cb(int a){
	int res=a*a*a;
	printf("%d",res);
}
