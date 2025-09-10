// wap to check no is positive negative or neutral
void isNo(int);
void main(){
	int no;
	printf("enter no: ");
	scanf("%d",&no);
	isNo(no);
}

void isNo(int no){
	if(no>0){
		printf("no is positive ");
		
	}
	else if(no==0){
		printf(" no is neutral");
	}
	else{
		printf("no is negative");
	}
}
