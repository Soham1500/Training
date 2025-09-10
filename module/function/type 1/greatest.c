// Write a program to find greatest of three numbers 

void main(){
printf("%d is greatest ",greatest());
}

int greatest(){
	int n1,n2,n3;
	printf("enter 3 nos :");
	scanf("%d%d%d",&n1,&n2,&n3);
	if(n1>n2 && n1>n3){
		return n1;
	}
	else if(n2>n1 && n2>n3){
		return n2;
	}
	else{
		return n3;
	}
}
