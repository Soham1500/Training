// to print no in array 
void main() {
	int i,j;
	int arr[]={2,5,8,6};
	int count;
	int size=sizeof(arr)/sizeof(int);
	for(i=0;i<size;i++){
		count=0;
		for(j=1;j<=arr[i];j++)
{
	if(arr[i]%j==0){
		count++;
	}
	}	
	if(count==2){
		printf("prime no ");
	
	
	}else{
		printf("not ");
	}
	
}
	
	
	
}
