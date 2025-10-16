void rotate(char* ,int,int);
void main(){
	char str[]="hello";

	int size=strlen(str);
		rotate(str,2,size);
	
}

void rotate(char* str,int n,int size){
	int i=0,j=0;char temp[100];
	for(i=n;i<size;i++){
		temp[j++]=str[i];
	
	}
	for(i=0;i<n;i++){
	temp[j++]=str[i];	
	}

	temp[j]='\0';
	printf("%s",temp);
}
