package VendingMachineLLD;

public class Main {
    public static void main(String[] args){
        System.out.println("Say hiya to your vending machine!!!!!");
        VendingMachine vendingMachine = new VendingMachine();
        try{
            System.out.println("----------Filling up the inventory------------");
            fillUPInventory(vendingMachine);
            System.out.println("----------Display Inventory------------");
            displayInventory(vendingMachine);
            System.out.println("---------------------------------");

            State vendingMachineState = vendingMachine.getVendingMachineState();
            System.out.println("---------press insert coin button---------");
            vendingMachineState.pressInsertCoinButton(vendingMachine);

            vendingMachineState = vendingMachine.getVendingMachineState();
            System.out.println("--------insert five coin----------");
            vendingMachineState.insertCoin(vendingMachine, Coin.FIVE);
            System.out.println("--------insert five rupee coin-----------");
            vendingMachineState.insertCoin(vendingMachine, Coin.FIVE);
            System.out.println("--------insert five rupee coin-----------");
            vendingMachineState.insertCoin(vendingMachine, Coin.TWO);


            System.out.println("-------press select product button---------");
            vendingMachineState.pressSelectProductButton(vendingMachine);

            vendingMachineState = vendingMachine.getVendingMachineState();
            System.out.println("-----order coke------------");
            vendingMachineState.selectProduct(vendingMachine, 101);

            System.out.println("-------final display after shopping--------");
            displayInventory(vendingMachine);


        } catch (Exception e){
            System.out.println(e);
        }
    }
    private static void fillUPInventory(VendingMachine vendingMachine) throws Exception {
        Product coke = new Product(1, 10, "Coke");
        Product pepsi = new Product(2, 15, "Pepsi");
        Product lays = new Product(3, 5, "Lays");

        Inventory inventory = vendingMachine.getInventory();

        inventory.addProduct(101, coke, 10);
        inventory.addProduct(102, pepsi, 5);
        inventory.addProduct(103, lays, 10);
    }
    private static void displayInventory(VendingMachine vendingMachine){
        ProductShelf[] shelfList = vendingMachine.getInventory().getProductShelfList();
        for(ProductShelf productShelf: shelfList){
            if(productShelf.getProduct() == null) continue;
            System.out.println("Code Number: " + productShelf.getCode() + " | " +
                    "Product: " + productShelf.getProduct().getName() + " | "+
                    "Price: " + productShelf.getProduct().getPrice() + " | "+
                    "IsAvailable: " + productShelf.isAvailable() + " | " +
                    "Quantity: " + productShelf.getQuantity());
        }
    }
}
