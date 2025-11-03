

//Admin id nme salary

class Admin {
int id;
String name;
double salary;
double allowance;

void printId(int i){
this.id=i;
}

void printName(String n){
this.name=n;}
void getAllowance(double allowa){
this.allowance=allowa;
}

void printSalary(double sal){
this.salary=sal+allowance;
}

}

class Test{

public static void main(String[] args){

Admin a1;
a1=new Admin();


a1.printId(101);         
a1.getAllowance(10000);   
a1.printName("virus");
a1.printSalary(299999.99);


System.out.println(a1.id +" " +a1.name + " "+a1.salary);
}}