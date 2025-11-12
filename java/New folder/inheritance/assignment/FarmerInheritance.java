package inheritance;

// Base Class
class Farmer {
    int farmerId;
    String farmerName;
    String landArea;
    String city;
    double annualIncome;
    int noOfEquipment;
    double insuranceAmt;

    // Getters and Setters
    public int getFarmerId() {
        return farmerId;
    }
    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }
    public String getFarmerName() {
        return farmerName;
    }
    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }
    public String getLandArea() {
        return landArea;
    }
    public void setLandArea(String landArea) {
        this.landArea = landArea;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public double getAnnualIncome() {
        return annualIncome;
    }
    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }
    public int getNoOfEquipment() {
        return noOfEquipment;
    }
    public void setNoOfEquipment(int noOfEquipment) {
        this.noOfEquipment = noOfEquipment;
    }
    public double getInsuranceAmt() {
        return insuranceAmt;
    }
    public void setInsuranceAmt(double insuranceAmt) {
        this.insuranceAmt = insuranceAmt;
    }

    // Default Constructor
    Farmer() {
        this.farmerId = 101;
        this.farmerName = "Ramesh Patil";
        this.landArea = "15 acres";
        this.city = "Nashik";
        this.annualIncome = 450000.00;
        this.noOfEquipment = 8;
        this.insuranceAmt = 150000.00;
    } // default constructor ends here

    // Parameterized Constructor
    Farmer(int farmerId, String farmerName, String landArea, String city,
           double annualIncome, int noOfEquipment, double insuranceAmt) {
        this.farmerId = farmerId;
        this.farmerName = farmerName;
        this.landArea = landArea;
        this.city = city;
        this.annualIncome = annualIncome;
        this.noOfEquipment = noOfEquipment;
        this.insuranceAmt = insuranceAmt;
    } // parameterized constructor ends here

    // Display Function
    void display() {
        System.out.println("\n--- Farmer Details ---");
        System.out.println("Farmer ID           : " + this.farmerId);
        System.out.println("Farmer Name         : " + this.farmerName);
        System.out.println("Land Area           : " + this.landArea);
        System.out.println("City                : " + this.city);
        System.out.println("Annual Income (Rs.) : " + this.annualIncome);
        System.out.println("No. of Equipment    : " + this.noOfEquipment);
        System.out.println("Insurance Amount    : " + this.insuranceAmt);
    } // display ends here
} // Farmer class ends here


// Child Class 1: DairyFarmer
class DairyFarmer extends Farmer {
    int noOfCattles;
    int milkProducedPerDay;
    long dairyLicenseNo;

    // Default constructor
    DairyFarmer() {
        super();
        this.noOfCattles = 20;
        this.milkProducedPerDay = 60;
        this.dairyLicenseNo = 987654321L;
    }

    // Parameterized constructor
    DairyFarmer(int farmerId, String farmerName, String landArea, String city,
                double annualIncome, int noOfEquipment, double insuranceAmt,
                int noOfCattles, int milkProducedPerDay, long dairyLicenseNo) {
        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmt);
        this.noOfCattles = noOfCattles;
        this.milkProducedPerDay = milkProducedPerDay;
        this.dairyLicenseNo = dairyLicenseNo;
    }

    void display() {
        super.display();
        System.out.println("No. of Cattles         : " + this.noOfCattles);
        System.out.println("Milk Produced (lit/day): " + this.milkProducedPerDay);
        System.out.println("Dairy License No       : " + this.dairyLicenseNo);
    }
} // DairyFarmer ends here


// Child Class 2: PoultryFarmer
class PoultryFarmer extends Farmer {
    int noOfChickens;
    int noOfSheds;
    int shedCapacity;
    int eggProductionPerDay;
    String poultryFarmName;

    // Default constructor
    PoultryFarmer() {
        super();
        this.noOfChickens = 50;
        this.noOfSheds = 2;
        this.shedCapacity = 25;
        this.eggProductionPerDay = 100;
        this.poultryFarmName = "Default Poultry Farm";
    } // default constructor ends here

    // Parameterized constructor
    PoultryFarmer(int farmerId, String farmerName, String landArea, String city,
                  double annualIncome, int noOfEquipment, double insuranceAmt,
                  int noOfChickens, int noOfSheds, int shedCapacity,
                  int eggProductionPerDay, String poultryFarmName) {
        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmt);
        this.noOfChickens = noOfChickens;
        this.noOfSheds = noOfSheds;
        this.shedCapacity = shedCapacity;
        this.eggProductionPerDay = eggProductionPerDay;
        this.poultryFarmName = poultryFarmName;
    } // parameterized constructor ends here

    void display() {
        super.display();
        System.out.println("No. of Chickens      : " + this.noOfChickens);
        System.out.println("No. of Sheds         : " + this.noOfSheds);
        System.out.println("Shed Capacity        : " + this.shedCapacity);
        System.out.println("Egg Production/Day   : " + this.eggProductionPerDay);
        System.out.println("Poultry Farm Name    : " + this.poultryFarmName);
    }
} // PoultryFarmer ends here


// Child Class 3: OrganicFarmer
class OrganicFarmer extends Farmer {
    long organicCertId;
    String cropType;
    String fertilizerUsed;

    // Default constructor
    OrganicFarmer() {
        super();
        this.organicCertId = 98765498L;
        this.cropType = "Sugarcane";
        this.fertilizerUsed = "Organic Compost";
    }

    // Parameterized constructor
    OrganicFarmer(int farmerId, String farmerName, String landArea, String city,
                  double annualIncome, int noOfEquipment, double insuranceAmt,
                  long organicCertId, String cropType, String fertilizerUsed) {
        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmt);
        this.organicCertId = organicCertId;
        this.cropType = cropType;
        this.fertilizerUsed = fertilizerUsed;
    }

    void display() {
        super.display();
        System.out.println("Organic Certificate ID : " + this.organicCertId);
        System.out.println("Crop Type              : " + this.cropType);
        System.out.println("Fertilizer Used        : " + this.fertilizerUsed);
    }
} // OrganicFarmer ends here


// Main Class
public class FarmerInheritance {
    public static void main(String[] args) {

        System.out.println("=== Dairy Farmer Details ===");
        DairyFarmer d1 = new DairyFarmer();
        d1.display();

        System.out.println("\n=== Poultry Farmer Details ===");
        PoultryFarmer p1 = new PoultryFarmer(102, "Suresh Kale", "10 acres", "Pune",
                300000.00, 5, 120000.00, 200, 4, 50, 400, "Happy Hens Farm");
        p1.display();

        System.out.println("\n=== Organic Farmer Details ===");
        OrganicFarmer o1 = new OrganicFarmer(103, "Mahesh Pawar", "8 acres", "Kolhapur",
                250000.00, 4, 90000.00, 99988877L, "Wheat", "Vermicompost");
        o1.display();
    }
}
