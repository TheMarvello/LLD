package VendingMachineLLD;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    ProductShelf[] inventory = null;

    Inventory(int shelfCount) {
        inventory = new ProductShelf[shelfCount];
        initializeEmptyInventory();
    }

    private void initializeEmptyInventory(){
        int startCode = 101;
        for(int i = 0; i<inventory.length; i++) {
            ProductShelf productShelf = new ProductShelf();
            productShelf.setCode(startCode);
            productShelf.setQuantity(0);
            inventory[i]=productShelf;
            startCode++;
        }
    }
    public void addProduct(int code, Product product, int quantity) throws Exception{
        for(ProductShelf productShelf: inventory) {
            if(productShelf.getCode() == code) {
                if(productShelf.quantity != 0) {
                    throw new Exception("Shelf already occupied!!");
                } else {
                    productShelf.product=product;
                    productShelf.quantity=quantity;
                }
            }
        }
    }
    public Product getProduct(int code) throws Exception{
        for(ProductShelf productShelf: inventory) {
            if(productShelf.getCode() == code) {
                if(productShelf.getQuantity() == 0) {
                    throw new Exception("Product is out of stock");
                } else {
                    productShelf.setQuantity(productShelf.getQuantity()-1);
                    return productShelf.product;
                }

            }
        }
        throw new Exception("Product code invalid");
    }
    private ProductShelf getProductShelf(int code) throws Exception{
        for(ProductShelf productShelf: inventory) {
            if(productShelf.getCode() == code) {
                if(productShelf.getQuantity() == 0) {
                    throw new Exception("Product is out of stock");
                } else {
                    productShelf.setQuantity(productShelf.getQuantity()-1);
                    return productShelf;
                }
            }
        }
        throw new Exception("Product code invalid");
    }

    public Product dispenseProduct(int productShelfCode) throws Exception {
        ProductShelf productShelf = getProductShelf(productShelfCode);
        productShelf.setQuantity(productShelf.getQuantity()-1);
        return productShelf.getProduct();
    }

    public ProductShelf[] getProductShelfList(){
        return inventory;
    }
}
