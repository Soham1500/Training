// vWrite a C program to add two integers and display the result

int add(int ,int );

void main(){
	int no1,no2;
	printf("enter no1 and no2 :");
	scanf("%d%d",&no1,&no2);
	printf(add(no1,no2));
}

int add(int x,int y){
	return x+y;

}
