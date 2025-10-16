typedef struct dateofBirth{
int d;
int m;
int y;
}dob;
int compare(dob,dob);
int compare(dob d1,dob d2){
	if(d1.d==d2.d && d1.m==d2.m && d1.y==d2.y){
		return 1;
	}
	else{
	return 0;
	}
}
void main(){
	dob d1,d2;
	printf("enter date month and yr : ");
	scanf("%d",&d1.d);
	scanf("%d",&d1.m);
	scanf("%d",&d1.y);
	
	printf("\n dob is %d/%d/%d  \n",d2.d,d2.m,d2.y);

	printf("enter date month and yr : ");
	scanf("%d",&d2.d);
	scanf("%d",&d2.m);
	scanf("%d",&d2.y);
	
	printf("\n dob is %d/%d/%d  \n",d2.d,d2.m,d2.y);
	
	int res=compare(d1,d2);
	if(res==1){
		printf("dates are equal ");
	}
	else{
		printf("dates are not equal ");
	}
	
	
}
