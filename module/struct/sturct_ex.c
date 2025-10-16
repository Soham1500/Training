typedef struct student{
	int roll;
	char name[10];
}student;
student store();
void display(student);
void main(){
	student july[5],aug[10],sept[15];
	int i=0;
	for(i=0;i<5;i++){
		july[i]=store();
	}
		for(i=0;i<10;i++){
		aug[i]=store();
	}
		for(i=0;i<15;i++){
		sept[i]=store();
	}
	for(i=0;i<5;i++){
		display(july[i]);
	}
		for(i=0;i<10;i++){
			display(aug[i]);
	}
		for(i=0;i<15;i++){
			display(july[i]);
	}
	
}

student store(){
	student s;
	printf("enter roll and name of student :");
	scanf("%d",&s.roll);
	scanf("%s",s.name);
	return s;
}

void display(student s){
	printf("\n roll no is %d and name is %s ",s.roll,s.name);
}
