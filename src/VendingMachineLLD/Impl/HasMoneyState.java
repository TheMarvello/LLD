package VendingMachineLLD.Impl;

import VendingMachineLLD.Coin;
import VendingMachineLLD.Product;
import VendingMachineLLD.State;
import VendingMachineLLD.VendingMachine;

import java.util.List;

public class HasMoneyState implements State {
    public HasMoneyState(){
        System.out.println("You can start inserting coins now");
    }
    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        return;
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);
    }
    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setVendingMachineState(new SelectionState());
        System.out.println("You can select the product code now");
    }
    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception{
        System.out.println("Returned the full amount back in the coin dispense tray");
        List<Coin> coins = vendingMachine.getCoinList();
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return coins;
    }
    @Override
    public void selectProduct(VendingMachine vendingMachine, int productShelfCode) throws Exception{
        throw new Exception("You need to press on select Product button first!!");
    }
    @Override
    public int returnChange(int change) throws Exception{
        throw new Exception("You cannot get change in the hasMoney state!!");
    }
    @Override
    public Product dispenseProduct(VendingMachine vendingMachine, int  productShelfCode) throws Exception{
        throw new Exception("Product cannot be dispensed in the hasMoney state!!");
    }
}
