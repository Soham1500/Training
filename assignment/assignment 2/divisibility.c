//Accept a number and check if it is divisible by 3, 5, or both.
//(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//both" or” Divisible by None”)

void main(){
	int no;
	printf("enter a number: ");
	scanf("%d",&no);
	if(no%3==0 && no%5==0){
		printf(" no is divisible by both 3 and 5");
	}
	else if(no%3==0 && no%5!=0){
		printf("no is divisible by 3 and not by 5");
	}
	else if(no%3!=0 && no%5==0){
		printf("no is divisible by 5 and not by 3");
	}
	else{
		printf("it is not divisble by 3 and not by 5");
	}
}
