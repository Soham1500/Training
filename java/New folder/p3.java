

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
System.out.println(this.getId()+" "+this.getName()+" " +this.getSalary());
}

HR(){
this.id=103;
this.name="lkkk";
this.salary=10000+2000;
this.commission=2000;
System.out.println(this.id+" "+this.name+" "+this.salary+" "+this.commission);


}


HR(int d,String n,double s,double c){
this.id=d;
this.name=n;
this.commission=c;

this.salary=s+commission;
System.out.println(this.id+" "+this.name+" " +this.salary);

}
}

class Test{

public static void main(String[] args){

HR h1;
h1=new HR(1,"sam",1200,1000);
HR h2=new HR();

h1.printId(101);         
h1.getCommission(10000);   
h1.printName("virus");
h1.printSalary(299999.99);

//h1.display();

}}