//Print a right-angled triangle pattern
//Input: n = 5
//Output:
//*
//**
//***
//****
//*****

void main(){
	int i,j;
	for(i=1;i<=5;i++){
		for(j=1;j<=i;j++){
			printf("*");
		}
		printf("\n");
	}
}
