package VendingMachineLLD;

import java.util.List;

public interface State {
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception;
    public void pressCancelButton(VendingMachine vendingMachine) throws Exception;
    public void selectProduct(VendingMachine vendingMachine, int productShelfCode) throws Exception;
    public void returnChange(VendingMachine vendingMachine, List<Coin> coinList) throws Exception;
    public void dispenseProduct(VendingMachine vendingMachine, int productShelfCode) throws Exception;


}
