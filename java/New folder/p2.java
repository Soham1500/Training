

//Admin id nme salary
import java.util.Scanner;
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
Admin(){
this.id=103;
this.name="lkkk";
this.salary=10000+5000;
this.allowance=5000;
System.out.println(this.id+" "+this.name+" "+this.salary+" "+this.allowance);


}

Admin(int i,String n,double s,double al){
this.id=i;
this.name=n;
this.salary=s+al;
this.allowance=al;
System.out.println(this.id+" "+this.name+" "+this.salary+" "+this.allowance);
}

}

class Test{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int id=Integer.parseInt(sc.nextLine());
String n=sc.nextLine();
double sal=sc.nextDouble();
double a=sc.nextDouble();
Admin a1;
a1=new Admin(id,n,sal,a);


a1.printId(101);         
a1.getAllowance(10000);   
a1.printName("virus");
a1.printSalary(299999.99);

Admin a2=new Admin(102,"sam",10000,5000);
//a1.display();

}}