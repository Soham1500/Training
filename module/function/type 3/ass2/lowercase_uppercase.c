//Write a program to check whether a given character is uppercase or lowercase.


void isuppercase(char c){

	if(c>='a'&&c<='z' || c>='A'&&c<='Z'){
		if(c>='a' && c<='z'){
			printf("%c is lowercase",c);
		}
		else{
			printf("%c is upperCase");
		}
		
	}
	else{
		printf("enter valid character");
	}
	
}

void main(){
	char ch;
	printf("enter char :" );
	scanf("%c",&ch);
	isuppercase(ch);
	
}
