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

    void display() {
        System.out.println(productId + " " + productName + " " + price + " " + quantity);
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
    }
}
