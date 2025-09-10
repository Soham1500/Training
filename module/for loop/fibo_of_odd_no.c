// 1+3+5+7+9....
void main(){
	int n,i=1;
	printf("enter no:");
	scanf("%d",&n);
	
	for(i;i<=n;i++){
		if(i%2!=0){
				if(i==n && i%2!=0){
			printf(" %d",i);
			return;
		}
			printf(" %d+",i);
		}
	
	}
}

