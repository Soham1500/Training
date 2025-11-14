package inheritance;

class Employee {
	String name;
	int empId;
	double salary;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getEmpId() {
		return empId;
	}

	void setEmpId(int empId) {
		this.empId = empId;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	double calculateSalary() {
		return  salary;
	}

	void work() {
		System.out.println("Start Working");
	}

	void attendMeeting() {
		System.out.println("Attend meeting ");
	}

	void applyLeave() {
		System.out.println("Apply leave method ");
	}

	Employee() {
		this.name = "Sam";
		this.empId = 101;
		this.salary = 120000;
	} // default constructor ends

	Employee(String n, int e, double s) {
		this.name = n;
		this.empId = e;
		this.salary = s;
	} // parameterized constructor ends

	void display() {
		System.out.println("\n");
		System.out.println("Employee ID : " + this.empId);
		System.out.println("Name : " + this.name);
		System.out.println("Salary : " + this.salary);
	} // display function ends
} // class Employee ends


class HR extends Employee {
	int teamSize;
double commission;
	public double getCommission() {
	return commission;
}

public void setCommission(double commission) {
	this.commission = commission;
}

	int getTeamSize() {
		return teamSize;
	}

	void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	void assignTask() {
		System.out.println("Assign Task Method ");
	}

	void evaluatePerformance() {
		System.out.println("Evaluate Performance Method ");
	}
double calculateSalary() {
	return salary+commission;
}
	void display() {
		super.display();
		System.out.println("Team Size : " + this.teamSize);
		System.out.println("Salay : "+this.calculateSalary());
	} // display function ends

	HR() {
		super();
		this.teamSize = 10;
	} // default constructor ends

	HR(String n, int e, double s, int t,double c) {
		super(n, e, s);
		this.teamSize = t;
		this.commission=c;
	} // parameterized constructor ends
} // class HR ends


class Admin extends Employee {
	String department;
double insentive;
	public double getInsentive() {
	return insentive;
}

public void setInsentive(double insentive) {
	this.insentive = insentive;
}

	String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	void manageResources() {
		System.out.println("Managing company resources");
	}

	void scheduleMeeting() {
		System.out.println("Scheduling meetings");
	}
	double calculateSalary() {
		return salary+insentive;
	}

	void display() {
		super.display();
		System.out.println("Department : " + this.department);
		System.out.println("Salay : "+this.calculateSalary());
	} // display function ends

	Admin() {
		super();
		this.department = "Operations";
	} // default constructor ends

	Admin(String n, int e, double s, String d,double in) {
		super(n, e, s);
		this.department = d;
		this.insentive=in;
	} // parameterized constructor ends
} // class Admin ends


public class EmployeeInher {
	public static void main(String[] args) {
//		HR h1 = new HR();
//		h1.display();
//
//		
//		HR h2 = new HR("Ravi", 201, 95000, 15);
//		h2.display();
//
//		Admin a1 = new Admin("Neha", 301, 85000, "Finance");
//		a1.display();
		
		Employee e1;//generic reference
		e1=new Employee("sam",12,12123);
		e1.display();
		
		e1=new HR("saaam",123,987,9876,89000);
		e1.display();
		e1=new Admin("lkj",43,65,"plpl",89999);
		e1.display();
		e1=new SalesMan("asam",9782,999,32);
		e1.display();
	}
} // class EmployeeInher ends
