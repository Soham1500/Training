class Complex {
    double real;
    double imaginary;

    void setReal(double r) {
        this.real = r;
    }

    void setImaginary(double i) {
        this.imaginary = i;
    }

double getReal(){
return this.real;
}
double getImaginary(){
return this.imaginary;
}



    void display() {
        System.out.println(this.getReal() + " + " + imaginary + "i");
    }

Complex(){
this.real=1;
this.imaginary=2;
        System.out.println(this.real+ " + "+this.imaginary + "i");
}
Complex(double r,double i){
this.real=r;
this.imaginary=i;
        System.out.println(this.real+ " + "+this.imaginary + "i");

}
}

class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex();

        c1.setReal(3.5);
        c1.setImaginary(2.5);

        c1.display();

Complex c2=new Complex(2,3);
    }
}
