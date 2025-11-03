class Complex {
    double real;
    double imaginary;

    void setReal(double r) {
        this.real = r;
    }

    void setImaginary(double i) {
        this.imaginary = i;
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex();

        c1.setReal(3.5);
        c1.setImaginary(2.5);

        c1.display();
    }
}
