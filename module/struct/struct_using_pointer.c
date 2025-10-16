typedef struct student{
	int roll;
	char name[10];
}student;
void store(student*);
void display(student*);
void main(){
	student s1,s2,s3;
	store(&s1);
	display(&s1);
	store(&s2);
	display(&s2);
	store(&s3);
	display(&s3);
}

void store(student* s){
	printf("\n enter roll no and name :");
	scanf("%d%s",&s->roll,s->name);
}
void display(student* s){
	printf("\n roll no = %d and name are %s",s->roll,s->name);
}

