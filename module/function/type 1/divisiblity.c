// Accept a number and check if it is divisible by 3, 5, or both.



char* divisibility_test(){
	int num=10;
	if(num %3==0 &&num%5==0){
		return "no is divisible by 3 & 5";
	}
	else if(num%3!=0 && num%5==0){
		return " no is divisible by 5";
	}
	else if(num%3==0 && num%5!=0){
		return "no is divisible by 3";
	}
	else{
		return "dont know";
	}
}
void main(){
	printf("%s",divisibility_test());
	
}
