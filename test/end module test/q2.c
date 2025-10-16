void count(char name[] );

void main(){
	char name[10];
	printf("enter name : ");
	scanf("%s",name);
	
	count(name);
	
}

void count(char name[]){
	int i=0,j=0,k;
	
	
	for(i=0;name[i]!='\0';i++){
		
		int ccount=0;
	int alreadyprint=0;
	for(k=0;k<i;k++){
		if(name[k]==name[i]){
			alreadyprint=1;
			break;
	}
}
	if(!alreadyprint){
		for(j=0;name[j]!='\0';j++){
			if(name[i]==name[j]){
				ccount++;
			
			}
			
	}	printf(" %c - %d ",name[i],ccount);
		}
		
	}
}
