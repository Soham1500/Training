// Write a program to check whether a given character is a vowel or consonant.

void main (){
	char c='O';
	if(c>='a' && c<='z' || c>='A'&& c<='Z'){
	
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
		printf("%c is vowel",c);
		}
		else{
		printf("%c is consonant",c);
		}
} 	
	else{
		printf("%c is not character",c);
}

}
