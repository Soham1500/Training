// for loop 
//
//for(_initialization__,__cond__,__incre/decree__)
//
//when to use for loop and while loop
//
//in  for loop no of iterations are fixed you know it 
//
//in while loop no of iteration are not fixed  
//primeno using for
//void main(){
//	int i,no=23,count=0;
//	for(i=2;i<=no/2;i++){
//	if(no%i==0){
//	   count++;
//	}
//	
//
//	}
//	if(count>=1){
//		printf("no is not prime");
//	}
//	else{
//		printf("no is prime");
//	}
//}

               //  Factorial of a number 
               
               
//               void main(){
//               	int i,fact=1,no=5;
//               	for(i=1;i<=no;i++){
//               		fact=fact*i;
//				   }
//				   printf("factorial of no is : %d",fact);;
//			   }


// Print numbers from 1 to 10
//Output: 1 2 3 4 5 6 7 8 9 10
					
					//void main(){
					//	int i;
					//	for(i=1;i<=10;i++){
					//		printf("%d ",i);
					//	}
					//}
//
//Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50


//					void main(){
//						int no=5,i;
//						for(i=1;i<=10;i++){
//							printf(" %d x %d = %d\n",no,i,(no*i));
//						}
//					}
					
					
//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15

//void main (){
//	int start=1 ,end=10,sum=0;
//	for(start;start<=end;start++){
//		sum+=start;
//	}
//	printf("sum is %d",sum);
//}

 // Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome


void main(){
	int n=121,rev,i,rem=0,no=n;
	for( i=1;no!=0;i++){
		rem=no%10;
		no=no/10;
		rev=rev*10+rem;
		
	}
	if(n==rev){
		printf("palindrone");
	}
	else{
		printf("not palindrone");
	}
}
