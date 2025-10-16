typedef struct student{
	int roll;
	char name[10];
}student;
student store();
student display(student);
void main(){
	student sarr[5];int i=0;
	for(i=0;i<5;i++){
		sarr[i]=store();
	}
	for(i=0;i<5;i++){
		display(sarr[i]);
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
