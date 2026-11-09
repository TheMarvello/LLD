package VendingMachineLLD;

public class Product {
    int code;
    int price;
    String name;

    public Product(int code, int price, String name){
        this.code = code;
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
