
//A +AA +AAA +AAAA +AAAAA +AAAAAA +AAAAAAA +AAAAAAAA +AAAAAAAAA +AAAAAAAAAA

//void main(){
//	char ch='A';
//	int i,j,n=10;
//	for(i=1;i<=n;i++){
//		for(j=1;j<=i;j++){
//			printf("%c",ch);
//			
//		}if(i<n)
//		printf(" +");
//	}
//}


//1 +12 +123 +1234 +12345 +123456 +1234567 +12345678 +123456789 +12345678910

void main(){

	int i,j,n=10;
	for(i=1;i<=n;i++){
		for(j=1;j<=i;j++){
			printf("%d",j);
			
		}if(i<n)
		printf(" +");
	}
}
