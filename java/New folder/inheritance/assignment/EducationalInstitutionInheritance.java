package inheritance;

class EducationalInstitution {
    String name;
    String location;
    int establishedYear;
    int totalStudents;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEstablishedYear() {
		return establishedYear;
	}

	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	// Default constructor
    EducationalInstitution() {
        this.name = "Default Institution";
        this.location = "Unknown City";
        this.establishedYear = 2000;
        this.totalStudents = 1000;
    } // default constructor ends here

    // Parameterized constructor
    EducationalInstitution(String name, String location, int establishedYear, int totalStudents) {
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
        this.totalStudents = totalStudents;
    } // parameterized constructor ends here

    void display() {
        System.out.println("\n--- Educational Institution Details ---");
        System.out.println("Name             : " + name);
        System.out.println("Location         : " + location);
        System.out.println("Established Year : " + establishedYear);
        System.out.println("Total Students   : " + totalStudents);
    } // display method ends here
} // EducationalInstitution class ends here


class School extends EducationalInstitution {
    int noOfTeachers;
    int noOfClasses;
    boolean hasPlayground;

    public int getNoOfTeachers() {
		return noOfTeachers;
	}

	public void setNoOfTeachers(int noOfTeachers) {
		this.noOfTeachers = noOfTeachers;
	}

	public int getNoOfClasses() {
		return noOfClasses;
	}

	public void setNoOfClasses(int noOfClasses) {
		this.noOfClasses = noOfClasses;
	}

	public boolean isHasPlayground() {
		return hasPlayground;
	}

	public void setHasPlayground(boolean hasPlayground) {
		this.hasPlayground = hasPlayground;
	}

	// Default constructor
    School() {
        super();
        this.noOfTeachers = 50;
        this.noOfClasses = 20;
        this.hasPlayground = true;
    } // default constructor ends here

    // Parameterized constructor
    School(String name, String location, int establishedYear, int totalStudents,
           int noOfTeachers, int noOfClasses, boolean hasPlayground) {
        super(name, location, establishedYear, totalStudents);
        this.noOfTeachers = noOfTeachers;
        this.noOfClasses = noOfClasses;
        this.hasPlayground = hasPlayground;
    } // parameterized constructor ends here

    void display() {
        super.display();
        System.out.println("No. of Teachers  : " + noOfTeachers);
        System.out.println("No. of Classes   : " + noOfClasses);
        System.out.println("Has Playground   : " + hasPlayground);
    } // display method ends here
} // School class ends here


class College extends EducationalInstitution {
    int noOfDepartments;
    int noOfLabs;
    String universityAffiliation;

    public int getNoOfDepartments() {
		return noOfDepartments;
	}

	public void setNoOfDepartments(int noOfDepartments) {
		this.noOfDepartments = noOfDepartments;
	}

	public int getNoOfLabs() {
		return noOfLabs;
	}

	public void setNoOfLabs(int noOfLabs) {
		this.noOfLabs = noOfLabs;
	}

	public String getUniversityAffiliation() {
		return universityAffiliation;
	}

	public void setUniversityAffiliation(String universityAffiliation) {
		this.universityAffiliation = universityAffiliation;
	}

	// Default constructor
    College() {
        super();
        this.noOfDepartments = 10;
        this.noOfLabs = 15;
        this.universityAffiliation = "Default University";
    } // default constructor ends here

    // Parameterized constructor
    College(String name, String location, int establishedYear, int totalStudents,
            int noOfDepartments, int noOfLabs, String universityAffiliation) {
        super(name, location, establishedYear, totalStudents);
        this.noOfDepartments = noOfDepartments;
        this.noOfLabs = noOfLabs;
        this.universityAffiliation = universityAffiliation;
    } // parameterized constructor ends here

    void display() {
        super.display();
        System.out.println("Departments      : " + noOfDepartments);
        System.out.println("Labs             : " + noOfLabs);
        System.out.println("Affiliation      : " + universityAffiliation);
    } // display method ends here
} // College class ends here


class University extends EducationalInstitution {
    int noOfColleges;
    String viceChancellorName;
    double researchFunds;

    public int getNoOfColleges() {
		return noOfColleges;
	}

	public void setNoOfColleges(int noOfColleges) {
		this.noOfColleges = noOfColleges;
	}

	public String getViceChancellorName() {
		return viceChancellorName;
	}

	public void setViceChancellorName(String viceChancellorName) {
		this.viceChancellorName = viceChancellorName;
	}

	public double getResearchFunds() {
		return researchFunds;
	}

	public void setResearchFunds(double researchFunds) {
		this.researchFunds = researchFunds;
	}

	// Default constructor
    University() {
        super();
        this.noOfColleges = 25;
        this.viceChancellorName = "Dr. Default VC";
        this.researchFunds = 10_000_000.50;
    } // default constructor ends here

    // Parameterized constructor
    University(String name, String location, int establishedYear, int totalStudents,
               int noOfColleges, String viceChancellorName, double researchFunds) {
        super(name, location, establishedYear, totalStudents);
        this.noOfColleges = noOfColleges;
        this.viceChancellorName = viceChancellorName;
        this.researchFunds = researchFunds;
    } // parameterized constructor ends here

    void display() {
        super.display();
        System.out.println("No. of Colleges  : " + noOfColleges);
        System.out.println("Vice Chancellor  : " + viceChancellorName);
        System.out.println("Research Funds ₹ : " + researchFunds);
    } // display method ends here
} // University class ends here


public class EducationalInstitutionInheritance {
    public static void main(String[] args) {
        System.out.println("=== Default Constructors ===");
        School s = new School();
        s.display();

        College c = new College();
        c.display();

        University u = new University();
        u.display();

        System.out.println("\n=== Parameterized Constructors ===");
        School s2 = new School("Sunrise High School", "Pune", 1995, 1500, 80, 35, true);
        s2.display();

        College c2 = new College("Techno College", "Mumbai", 2005, 2500, 8, 20, "Mumbai University");
        c2.display();

        University u2 = new University("Global University", "Delhi", 1978, 20000, 120, "Dr. Priya Sharma", 7500000.75);
        u2.display();
    } // main method ends here
} // EducationalInstitutionInheritance class ends here
