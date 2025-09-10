//Write a program to check whether a given character is uppercase or lowercase.



void main(){
	char c='k';
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
