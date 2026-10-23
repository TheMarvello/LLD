package VendingMachineLLD;

import java.util.List;

public interface State {
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
    public void selectProduct(VendingMachine vendingMachine, int productShelfCode) throws Exception;
    public int returnChange(int change) throws Exception;
    public Product dispenseProduct(VendingMachine vendingMachine, int productShelfCode) throws Exception;


}
