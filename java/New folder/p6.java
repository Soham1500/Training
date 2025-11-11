class Student {
    int rollNo;
    String name;
    double marks;

    void setRollNo(int r) {
        this.rollNo = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMarks(double m) {
        this.marks = m;
    }

int getRoll(){
return this.rollNo;
}

String getName(){
return this.name;
}

double getMarks(){
return this.marks;
}

    void display() {
        System.out.println("id= "+this.getRoll() + " name =  " +this.getName() + " marks= " +this.getMarks());
    }

Student(){
this.rollNo=103;
this.name="lkkk";
this.marks=89;
System.out.println(this.rollNo+" "+this.name+" "+this.marks);


}


Student(int d,String n,double m){
this.rollNo=d;
this.name=n;
this.marks=m;


System.out.println(this.rollNo+" "+this.name+" " +this.marks);

}

}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setRollNo(101);
        s1.setName("Anita");
        s1.setMarks(89.5);

        s1.display();

Student s2=new Student(104,"koo",78);
    }
}
