

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

String display(){
System.out.println(this.getId()+" "+this.getName()+" "+this.getSalary());
return " " ;
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
Admin a[]=new Admin[3];
a[0]=new Admin();
a[1]=new Admin();
a[2]=new Admin();

for(int i=0;i<a.length;i++){
System.out.println(a[i].display());
}
}}