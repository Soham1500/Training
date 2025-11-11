class SalesManager {
    int id;
    String name;
    double salary;
    double incentive;
    double target;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setIncentive(double inc) {
        this.incentive = inc;
    }

    void setTarget(double t) {
        this.target = t;
    }

   

int getId(){
return this.id;}

String getName(){
return this.name;
}
double getSalary(){
return this.salary;
}

double getIncentive(){
return this.incentive;
}

double getTarget(){
return this.target;
}

 void display() {
        System.out.println("id= "+this.getId() + " name= " + this.getName() + " salary= " + this.getSalary() + " incentive= " + this.getIncentive() + " target= " + this.getTarget());
    }

SalesManager(){
this.id=1;
this.name="Sam";
this.salary=120000;
this.incentive=10000;
this.target=20000000;
 System.out.println("id= "+this.getId() + " name= " + this.getName() + " salary= " + this.getSalary() + " incentive= " + this.getIncentive() + " target= " + this.getTarget());
    
}

SalesManager(int i,String na,double s,double in,double t){
this.id=i;
this.name=na;
this.salary=s+in;
this.incentive=in;
this.target=t;
System.out.println(this.id+" "+this.name+" "+this.salary+" "+this.incentive+" "+this.target);

}



}

class Test {
    public static void main(String[] args) {
        SalesManager s1 = new SalesManager();

        s1.setId(101);
        s1.setName("Ramesh");
        s1.setSalary(50000);
        s1.setIncentive(5000);
        s1.setTarget(100000);

        s1.display();
SalesManager s2=new SalesManager(102,"we",120,12,2);
    }
}
