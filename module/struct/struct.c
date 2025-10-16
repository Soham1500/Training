struct student{
	int rollno;
	char name[10];
	char baglor[10];
};

void main(){
	struct student s1;
	s1.rollno=20;
	strcpy(s1.name,"sam");
	strcpy(s1.baglor,"blue");
	
	printf("%d %s %s ",s1.rollno,s1.name,s1.baglor);
}
