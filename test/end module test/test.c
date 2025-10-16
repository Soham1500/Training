void fact(int n);

void main(){
	int n;
	printf("enter value of n:");
	scanf("%d",&n);
	
fact(n);
}

void fact(int n ){
		int i=1,sum=1;
	for(i=1;i<=n;i++){
		sum=sum*i;
	
	}
	printf("sum is %d ",sum);
}
