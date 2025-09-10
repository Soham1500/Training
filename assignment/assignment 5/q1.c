//Print a solid square pattern
//Input: n = 4
//Output:
//
//* * * *
//* * * *
//* * * *
//* * * *

void main(){
	int i=1,n=5,j;
	for(i;i<n;i++){
		for(j=1;j<n;j++){
			printf(" * ");
		}
		printf("\n");
	}
}
