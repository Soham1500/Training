//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)
void sum_start(int num){
		int i,n,last,first,rem;
	last=num%10;
	while(num>=10 ){
	
		num=num/10;
	//printf("%d ",num);
		first=num;
//		printf("%d ",first);
		}
//printf("%d",first);
int sum=first +last;
printf("%d ",sum);
}
void main(){
	int num=45655;
 sum_start(num);
}
