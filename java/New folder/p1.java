

//Emploee id nme salary
import java.util.Scanner;
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

int getId(){
return this.id;
}
String getName(){
return this.name;
}

double getSalary(){
return this.salary;
}

void display(){
System.out.println(this.getId()+" "+this.getName()+" "+this.getSalary());

} 
void Employee(){
this.id=103;
this.name="lkkk";
this.salary=10000;
System.out.println(this.id+" "+this.name+" "+this.salary);


}

Employee(int d,String n,double dd){
this.id=d;
this.name=n;
this.salary=dd;
System.out.println(this.id+" "+this.name+" "+this.salary);

}
}

class Test{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("enter id :");
int d=sc.nextInt();

sc.nextLine();
System.out.println("enter name :");
String name=sc.nextLine();
System.out.println("enter salary:");
double i=sc.nextDouble();
Employee e1;
e1=new Employee(d,name,i);

e1.printId(1);
e1.printName("virus");
e1.printSalary(299999.99);
//e1.display();

}}