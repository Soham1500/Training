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

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
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
		System.out.println("called constructor in employee ");
		this.name = "Sam";
		this.empId = 101;
		this.salary = 120000;
	} // default constructor ends

	Employee(String n, int e, double s) {
		System.out.println("called paa constructor in employee ");
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

	void display() {
		super.display();
		System.out.println("Team Size : " + this.teamSize);
	} // display function ends

	HR() {
		
		super();
		this.teamSize = 10;
		
		System.out.println("called constructor in hr ");
	} // default constructor ends

	HR(String n, int e, double s, int t) {
		
		super(n, e, s);
		this.teamSize = t;
		System.out.println("called psara constructor in hr ");
	} // parameterized constructor ends
} // class HR ends


class Admin extends Employee {
	String department;

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

	void display() {
		super.display();
		System.out.println("Department : " + this.department);
	} // display function ends

	Admin() {
		super();
		System.out.println("called constructor in Admin ");
		this.department = "Operations";
	} // default constructor ends

	Admin(String n, int e, double s, String d) {
		super(n, e, s);
		this.department = d;
		System.out.println("called constructor in Admin ");
	} // parameterized constructor ends
} // class Admin ends


class SalesMan extends Employee{
int target;

public int getTarget() {
	return target;
}

public void setTarget(int target) {
	this.target = target;
}

SalesMan(){
	super();
	this.target=100;
	System.out.println("called constructor in salesmsn ");
	
}
SalesMan(String n, int e, double s,int t){
	super(n,e,s);
	this.target=t;
	System.out.println("called constructor in saes ");
}

void display() {
	super.display();
	System.out.println("target is : "+this.target);
}

}

class AreaSalesManager extends SalesMan{
	String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	AreaSalesManager(){
		super();
		this.area="mumbai";
		System.out.println("called constructor in area ");
	}
	AreaSalesManager(String n, int e, double s,int t,String ar){
		super(n,e,s,t);
		this.area=ar;
		System.out.println("called constructor in area ");
	}
	void display() {
		super.display();
		System.out.println("area is "+area);
	}
	
}
public class EmployeeInheritance {
	public static void main(String[] args){
		
//		HR h1 = new HR();
//		h1.display();
//
//		
//		HR h2 = new HR("Ravi", 201, 95000, 15);
//		h2.display();
//
//		Admin a1 = new Admin("Neha", 301, 85000, "Finance");
//		a1.display();
		AreaSalesManager a1=new AreaSalesManager();
		a1.display();
	}
} // class EmployeeInher ends
