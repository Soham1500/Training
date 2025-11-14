package polymorphism;


class MusicalInstrument {
    String name;
    String type;
    String brand;
    int price;
    String material;

    // Default constructor
    public MusicalInstrument() {
        this.name = "Unknown";
        this.type = "Unknown";
        this.brand = "Unknown";
        this.price = 0;
        this.material = "Unknown";
    }

    // Parameterized constructor
    public MusicalInstrument(String name, String type, String brand, int price, String material) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.material = material;
    }

    // Behaviors
    void play() { 
    	System.out.println("Playing instrument..."); 
    	}
    void tune() {
    	System.out.println("Tuning instrument..."); 
    	}
    void stop() { 
    	System.out.println("Stopping instrument..."); 
    	}

    // Display method
    void display() {
        System.out.println("----- Musical Instrument Details -----");
        System.out.println("Name      : " + name);
        System.out.println("Type      : " + type);
        System.out.println("Brand     : " + brand);
        System.out.println("Price     : " + price);
        System.out.println("Material  : " + material);
        System.out.println("--------------------------------------");
    }
}


class Guitar extends MusicalInstrument {
    int noOfString;
    boolean isAcoustic;

    // Default constructor
    Guitar() {}

    // Parameterized constructor
    Guitar(String name, String type, String brand, int price, String material,
           int noOfString, boolean isAcoustic) {
        super(name, type, brand, price, material);
        this.noOfString = noOfString;
        this.isAcoustic = isAcoustic;
    }

    @Override
    void play() {
        System.out.println("🎸 Playing guitar sound...");
    }

    @Override
    void stop() {
        System.out.println("🔇 Guitar sound stopped.");
    }

    @Override
    void tune() {
        System.out.println("🎼 Tuning the guitar strings...");
    }

    @Override
    void display() {
        super.display();
        System.out.println("No of Strings : " + noOfString);
        System.out.println("Is Acoustic   : " + isAcoustic);
        System.out.println("--------------------------------------");
    }
}


class Flute extends MusicalInstrument {
    int length;
    char keyType;

    // Default constructor
    Flute() {}

    // Parameterized constructor
    Flute(String name, String type, String brand, int price, String material,
          int length, char keyType) {
        super(name, type, brand, price, material);
        this.length = length;
        this.keyType = keyType;
    }

    @Override
    void play() {
        System.out.println("🎶 Playing flute sound...");
    }

    @Override
    void stop() {
        System.out.println("🔇 Flute sound stopped.");
    }

    @Override
    void tune() {
        System.out.println("🎼 Tuning the flute...");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Length   : " + length);
        System.out.println("Key Type : " + keyType);
        System.out.println("--------------------------------------");
    }
}


public class MusicalInstrumentPoly {
    public static void main(String[] args) {
        // Guitar object
        Guitar g = new Guitar("Yamaha F280", "String", "Yamaha", 8000, "Wood", 6, true);
        g.display();
        g.play();
        g.tune();
        g.stop();

        System.out.println();

        // Flute object
        Flute f = new Flute("Bansuri", "Wind", "Hindustani", 1200, "Bamboo", 12, 'C');
        f.display();
        f.play();
        f.tune();
        f.stop();
    }
}
