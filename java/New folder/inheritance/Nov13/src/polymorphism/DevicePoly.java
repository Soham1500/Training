package polymorphism;


class Device {
    String brand;
    String model;
    double price;

    // Default constructor
    public Device() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Behaviors
    void turnOn() { 
    	System.out.println("Device is turning on..."); 
    	}
    void turnOff() { 
    	System.out.println("Device is turning off..."); 
    	}
    void use() { 
    	System.out.println("Using the device..."); 
    	}

    // Display method
    void display() {
        System.out.println("----- Device Details -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("--------------------------");
    }
}


class Smartphone extends Device {
    int storage; // in GB
    boolean has5G;

    // Default constructor
    Smartphone() {}

    // Parameterized constructor
    Smartphone(String brand, String model, double price, int storage, boolean has5G) {
        super(brand, model, price);
        this.storage = storage;
        this.has5G = has5G;
    }

    @Override
    void turnOn() { 
    	System.out.println(" Smartphone is turning on..."); 
    	}

    @Override
    void use() { 
    	System.out.println(" Using smartphone apps..."); 
    	}

    @Override
    void turnOff() { 
    	System.out.println(" Smartphone is turning off..."); 
    	}

    @Override
    void display() {
        super.display();
        System.out.println("Storage : " + storage + "GB");
        System.out.println("5G      : " + has5G);
        System.out.println("--------------------------");
    }
}


class Laptop extends Device {
    int ram; // in GB
    boolean isGamingLaptop;

    // Default constructor
    Laptop() {}

    // Parameterized constructor
    Laptop(String brand, String model, double price, int ram, boolean isGamingLaptop) {
        super(brand, model, price);
        this.ram = ram;
        this.isGamingLaptop = isGamingLaptop;
    }

    @Override
    void turnOn() {
    	System.out.println(" Laptop is powering on..."); 
    	}

    @Override
    void use() { 
    	System.out.println(" Using laptop applications..."); 
    	}

    @Override
    void turnOff() { 
    	System.out.println(" Laptop is shutting down..."); 
    	}

    @Override
    void display() {
        super.display();
        System.out.println("RAM            : " + ram + "GB");
        System.out.println("Gaming Laptop  : " + isGamingLaptop);
        System.out.println("--------------------------");
    }
}


public class DevicePoly {
    public static void main(String[] args) {
      
        Smartphone phone = new Smartphone("Apple", "iPhone 15", 1200.0, 256, true);
        phone.display();
        phone.turnOn();
        phone.use();
        phone.turnOff();

       

      
        Laptop laptop = new Laptop("Dell", "XPS 15", 1800.0, 16, false);
        laptop.display();
        laptop.turnOn();
        laptop.use();
        laptop.turnOff();
    }
}
