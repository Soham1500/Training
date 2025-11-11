import java.util.Scanner;

class BankAccount{

int accNo;
String name;
double currBal;
static double intRate=12.5;

void setAccNo(int a){
this.accNo=a;
}
void setName(String n){
this.name=n;
}

void setCurrBal(double b){
this.currBal=b;
}

static void setIntRate(double i){
intRate=i;
}



int getaccNo(){
return this.accNo;}

String getName(){
return this.name;
}

double getCurrBal(){
return this.currBal;
}

double getIntRate(){
return this.intRate;
}
void display(){
System.out.println(this.accNo+" "+this.name+" "+this.currBal+" "+this.intRate);}

BankAccount(){
this.accNo=2;
this.name="sqw";
this.currBal=1200.2;
System.out.println(this.accNo+" "+this.name+" "+this.currBal);
}

BankAccount(int a,String n,double b){
this.accNo=a;
this.name=n;
this.currBal=b;
System.out.println(this.accNo+" "+this.name+" "+this.currBal);
}
}

class Test{
public static void main(String[] args){

/* Scanner sc=new Scanner(System.in);
System.out.println("enter accNO:");
int a=sc.nextInt();
sc.nextLine();
System.out.println("enter name: ");
String s=sc.nextLine();
System.out.println("enter Current balance :");
double d=sc.nextDouble();
System.out.println("enter interest Rate: ");
double i=sc.nextDouble();
BankAccount ba1=new BankAccount();*/
BankAccount.setIntRate(14);
BankAccount b1=new BankAccount(1,"sam",1200);

BankAccount ba=new BankAccount(2,"wqe",123);
b1.display();

}}




