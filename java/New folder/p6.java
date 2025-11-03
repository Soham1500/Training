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

    void display() {
        System.out.println(rollNo + " " + name + " " + marks);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setRollNo(101);
        s1.setName("Anita");
        s1.setMarks(89.5);

        s1.display();
    }
}
