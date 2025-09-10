// perfect number 

void main(){
	int i,num=6,sum=0;
	for(i=1;i<num;i++){
		if(num%i==0){
			sum=sum+i;
		}
	}
		printf("%d ",sum);
	if(sum==num){
		printf("no is perfect");
	}
	else{
		printf("no is not perfect");
	}
}
