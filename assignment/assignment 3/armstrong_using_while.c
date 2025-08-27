//  Check the given number is Armstrong number or not..

//void main(){
//	int num=153,rem,sum=0;
//	int no=num;
//	while(num!=0){
//		rem=num%10;
//		num=num/10;
//		sum+=rem*rem*rem;
//	}
//	if(no==sum){
//		printf("it is armstrong");
//	}
//	else{
//		printf("it is not armstrong");
//	}
//}


//#include<stdio.h>
//
//int main(){
//	int i,j;
//	for(i=1;i<=15;i++){
//		for(j=1;j<=15;j++){
//			if(i==1||j==1||i==15||j==15||i==j || i<=8&&i+j==16)
//			printf("* ");
//			else
//			printf("  ");
//		}
//		printf("\n");
//	}
//return 0;
//}


//pattern 

//void main(){int i,j;
//	for( i=1;i<=5;i++){
//		for(j=1;j<=i;j++){
//			printf(" ");
//		}
//		printf("\n");
//	}
//}


void main(){
	int i,j;
	for(i=1;i<=5;i++){
		for(j=5;j>=i;j--){
			printf("* ");
		}
		printf("\n");
	}
}


