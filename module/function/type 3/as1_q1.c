// vWrite a C program to add two integers and display the result

void add(int ,int );

void main(){
	int no1,no2;
	printf("enter no1 and no2 :");
	scanf("%d%d",&no1,&no2);
	add(no1,no2);
}

void add(int x,int y){
	int res=x+y;
	printf("%d",res);
}
