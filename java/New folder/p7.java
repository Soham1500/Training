class Book {
    String ISBN;
    String bName;
    String category;
    double price;

    void setISBN(String i) {
        this.ISBN = i;
    }

    void setBName(String n) {
        this.bName = n;
    }

    void setCategory(String c) {
        this.category = c;
    }

    void setPrice(double p) {
        this.price = p;
    }

	String getISBN(){
return this.ISBN;
}
  String getbName(){
return this.bName;
}
String getCategory(){
return this.category;
}
double getPrice(){
return this.price;
}

    void display() {
        System.out.println(" ISBN = " +this.getISBN()+ " bName = " + this.getbName()+ " category= " +this.getCategory() + " price= " +this.getPrice());
    }

Book(){
this.ISBN="nmnm";
this.bName="opop";
this.category="ioio";
this.price=67;
System.out.println(" ISBN = " +this.ISBN+ " bName = " + this.bName+ " category= " +this.category + " price= " +this.price);

}

Book(String i,String n ,String c,double d){
this.ISBN=i;
this.bName=n;
this.category=c;
this.price=d;
System.out.println(" ISBN = " +this.ISBN+ " bName = " + this.bName+ " category= " +this.category + " price= " +this.price);

}

}

class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setISBN("9789856789");
        b1.setBName(" Java");
        b1.setCategory("Programming");
        b1.setPrice(850.50);

        b1.display();

Book b2=new Book("we","are","back",2);
    }
}
