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

String getModel(){
return this.model;}

String getBrand(){
return this.brand;
}
double getPrice(){
return this.price;
}

String getColor(){
return this.color;
}

int fuelCapacity(){
return this.fuelCapacity;
}

    void display() {
        System.out.println(model + " " + brand + " " + price + " " + color + " " + fuelCapacity);
    }

Car(){

this.model="www";
    this.brand="vw";
    this.price=200000;
    this.color="vlack";
    this.fuelCapacity=20;
System.out.println(this.brand+" "+this.price+" "+this.model+" "+this.color+" "+this.fuelCapacity);
}

Car(String m,String b,String c,double pr,int fu){

this.model=m;
    this.brand=b;
    this.price=pr;
    this.color=c;
    this.fuelCapacity=fu;
System.out.println(this.brand+" "+this.price+" "+this.model+" "+this.color+" "+this.fuelCapacity);
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

Car c2=new Car("Www","qqq","black",122,2);
    }
}
