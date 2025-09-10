//Write a C program to swap two numbers using a temporary third variable.


void swap(int a,int b);
void main(){
	int n1,n2;
	printf("enter nos1 and nos2: ");
	scanf("%d%d",&n1,&n2);
	swap(n1,n2);
}

void swap(int x,int y){
	int temp;
	temp=x;
	x=y;
	y=temp;
	printf("after swapping :\n");
	printf("%d\n",x);
	printf("%d",y);
}
