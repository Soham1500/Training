typedef struct dateofBirth{
int d;
int m;
int y;
}dob;


void main(){
	dob D;
	printf("enter date month and yr : ");
	scanf("%d",&D.d);
	scanf("%d",&D.m);
	scanf("%d",&D.y);
	
	printf("\n dob is %d/%d/%d",D.d,D.m,D.y);
}
