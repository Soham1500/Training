class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    void setProductId(int id) {
        this.productId = id;
    }

    void setProductName(String name) {
        this.productName = name;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setQuantity(int q) {
        this.quantity = q;
    }
int getProductId(){
return this.productId; 
}
String getProductName(){
return this.productName;
}
double getPrice(){
return this.price;
}
int quantity(){
return this.quantity;}

    void display() {
        System.out.println(" productId= "+this.getProductId() + " productName= "+this.getProductName()+" price = "+this.getPrice()+" quantity= "
+this.quantity());
}

Product(){
this.productId=101;this.productName="op";this.price=89;this.quantity=12;
System.out.println(this.productId+" " + this.productName+ "  " +this.price + "  " +this.quantity);

}

Product(int p,String n,double pr,int q){
this.productId=p;this.productName=n;this.price=pr;this.quantity=q;
System.out.println(this.productId+" " + this.productName+ "  " +this.price + "  " +this.quantity);
}


}

class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setProductId(301);
        p1.setProductName("Laptop");
        p1.setPrice(65000);
        p1.setQuantity(5);

        p1.display();

Product p2 = new Product(100,"qw",12,2);
    }
}
