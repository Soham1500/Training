class Car {
    String model;
    String brand;
    double price;
    String color;
    int fuelCapacity;

    void setModel(String m) {
        this.model = m;
    }

    void setBrand(String b) {
        this.brand = b;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setColor(String c) {
        this.color = c;
    }

    void setFuelCapacity(int fc) {
        this.fuelCapacity = fc;
    }

    void display() {
        System.out.println(model + " " + brand + " " + price + " " + color + " " + fuelCapacity);
    }
}

class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.setModel("i20");
        c1.setBrand("Hyundai");
        c1.setPrice(900000);
        c1.setColor("White");
        c1.setFuelCapacity(45);

        c1.display();
    }
}
