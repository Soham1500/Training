package ss;

class Appliance {
	String brand;
	int vtg;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVtg() {
		return vtg;
	}

	public void setVtg(int vtg) {
		this.vtg = vtg;
	}

	void turnOn() {
		System.out.println("Appliance started ");
	}

	void turnOff() {
		System.out.println("Appliance Stopped ");
	}

	Appliance() {
		this.brand = "LG";
		this.vtg = 130;
	} // default constructor ends

	Appliance(String b, int v) {
		this.brand = b;
		this.vtg = v;
	} // parameterized constructor ends

	void display() {
		System.out.println("\n");
		System.out.println("brand is : " + this.brand);
		System.out.println("Voltage is : " + this.vtg);
	} // display function ends
} // class Appliance ends


class WashingMachine extends Appliance {
	double drumCapacity;

	public double getDrumCapacity() {
		return drumCapacity;
	}

	public void setDrumCapacity(double drumCapacity) {
		this.drumCapacity = drumCapacity;
	}

	WashingMachine() {
		super();
		this.drumCapacity = 120;
	} // default constructor ends

	WashingMachine(String b, int v, double d) {
		super(b, v);
		this.drumCapacity = d;
	} // parameterized constructor ends

	void display() {
		super.display();
		System.out.println("drum Capacity is : " + this.drumCapacity);
	} // display function ends
} // class WashingMachine ends


public class Appliance_Inheritance {
	public static void main(String[] args) {
		WashingMachine w1 = new WashingMachine();
		w1.display();

		WashingMachine w2 = new WashingMachine("Samsung", 220, 150);
		w2.display();
	}
} // class Appliance_Inheritance ends
