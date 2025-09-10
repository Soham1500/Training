//Write a program to check whether a number is even or odd.

void even_odd(int num);

void main(){
	int num;
	printf("enter number : ");
	scanf("%d",&num);
	even_odd(num);
}

void even_odd(int num){
	num%2==0?printf("even "):printf("odd");
}
