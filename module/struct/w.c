typedef struct date{
	int d;
	int m;
	int y;
	
}date;

typedef struct student{
	int roll;
	char name[20];
	date dob;
	date doa;
}student;
void store(student*);
void display(student*);
void main(){
	student s1;
	
	store(&s1);
	display(&s1);
}

void store(student* s1){
	printf("enter roll no and name : ");
	scanf("%d%s",&s1->roll,s1->name);
	
	printf("\n enter dob : ");
	scanf("%d%d%d",&s1->dob.d,&s1->dob.m,&s1->dob.y);
	printf("\n enter admission date :");
	scanf("%d%d%d",&s1->doa.d,&s1->doa.m,&s1->doa.y);
}

void display(student* s ){
	printf(" \n roll no and name are %d and %s",s->roll,s->name);
	printf("\n dob is %d/%d/%d ",s->dob.d,s->dob.m,s->dob.y);
	printf("\n doa is %d/%d/%d ",s->doa.d,s->doa.m,s->doa.y);
}
