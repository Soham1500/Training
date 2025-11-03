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

    void display() {
        System.out.println(ISBN + " " + bName + " " + category + " " + price);
    }
}

class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setISBN("978-0134685991");
        b1.setBName("Effective Java");
        b1.setCategory("Programming");
        b1.setPrice(850.50);

        b1.display();
    }
}
