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

    void display() {
        System.out.println(id + " " + name + " " + salary + " " + incentive + " " + target);
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
    }
}
