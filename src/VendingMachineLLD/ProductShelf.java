package VendingMachineLLD;

public class ProductShelf {
    int code;
    Product product;
    int quantity;

    public void setCode(int code){
        this.code = code;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getCode(){
        return code;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
    public boolean isAvailable(){
        return quantity>0;
    }
}
