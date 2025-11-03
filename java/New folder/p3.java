

//HR id nme salary

class HR {
int id;
String name;
double salary;
double commission;

void printId(int i){
this.id=i;
}

void printName(String n){
this.name=n;}
void getCommission(double commi){
this.commission=commi;
}

void printSalary(double sal){
this.salary=sal+commission;
}

}

class Test{

public static void main(String[] args){

HR h1;
h1=new HR();


h1.printId(101);         
h1.getCommission(10000);   
h1.printName("virus");
h1.printSalary(299999.99);


System.out.println(h1.id +" " +h1.name + " "+h1.salary);
}}