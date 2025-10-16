typedef struct employee {
	int empid;
	float salary;
}employee;

employee store();
void display(employee);
void main(){
	int i=0;
	employee earr[5];
	
	for(i=0;i<5;i++){
		earr[i]=store();
	}
	for(i=0;i<5;i++){
		display(earr[i]);
	}

}
employee store(){
    employee e;
    printf("enter employee id and salary : ");
    scanf(" %d", &e.empid);
    scanf(" %f", &e.salary);
    return e;	
}


void display(employee e){
	printf("\n emp id is %d and name is %f",e.empid,e.salary);
}
