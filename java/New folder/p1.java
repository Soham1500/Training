

//Emploee id nme salary

class Employee {
int id;
String name;
double salary;

void printId(int i){
this.id=i;
}

void printName(String n){
this.name=n;}

void printSalary(double sal){
this.salary=sal;
}

}

class Test{

public static void main(String[] args){

Employee e1;
e1=new Employee();


e1.printName("virus");
e1.printSalary(299999.99);

System.out.println(e1.id +" " +e1.name + " "+e1.salary);
}}