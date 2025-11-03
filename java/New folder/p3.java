

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
this.salary=sal+allowance;
}

}

class Test{

public static void main(String[] args){

HR h1;
h1=new HR();


h1.printId(101);         
h1.getAllowance(10000);   
h1.printName("virus");
h1.printSalary(299999.99);


System.out.println(a1.id +" " +a1.name + " "+a1.salary);
}}