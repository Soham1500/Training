package ss;

class Shape {
	String color;

	void area() {
		System.out.println("area of Shape");
	} // area function ends

	void perimeter() {
		System.out.println("perimeter of shape ");
	} // perimeter function ends

	void display() {
		System.out.println("display method");
	} // display function ends
} // class Shape ends


class Circle extends Shape {
	double r, area;

	void area() {
		area = (3.14 * r * r);
	} // area function ends

	Circle() {
		this.r = 3;
	} // default constructor ends

	Circle(double ra) {
		this.r = ra;
	} // parameterized constructor ends

	void display() {
		super.display();
		System.out.println("area is " + area);
	} // display function ends
} // class Circle ends


class Rectangle extends Shape {
	int l, b;
	double area;

	void area() {
		area = l * b;
	} // area function ends

	Rectangle() {
		this.l = 10;
		this.b = 20;
	} // default constructor ends

	Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	} // parameterized constructor ends

	void display() {
		System.out.println("area is " + area);
	} // display function ends
} // class Rectangle ends


public class Shape_Inheritance {
	public static void main(String[] args) {
		Circle cc = new Circle(); // object created using default constructor
		cc.area();
		cc.display();
	}
} // class Shape_Inheritance ends
