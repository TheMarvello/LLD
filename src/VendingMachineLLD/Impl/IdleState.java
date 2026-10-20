package VendingMachineLLD.Impl;

import VendingMachineLLD.Coin;
import VendingMachineLLD.Product;
import VendingMachineLLD.State;
import VendingMachineLLD.VendingMachine;

import java.util.List;

public class IdleState implements State {
    public IdleState(){
        System.out.println("The machine is in IDLE state");
    }

    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("You can insert coins now");

    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        throw new Exception("Press insert coin button first");
    }
    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Press insert coin button first");
    }
    @Override
    public void pressCancelButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("You cannot cancel/get refund in the idle state");
    }
    @Override
    public void selectProduct(VendingMachine vendingMachine, int productShelfCode) throws Exception{
        throw new Exception("You cannot select product in the idle state");
    }
    @Override
    public void returnChange(VendingMachine vendingMachine, List<Coin> coinList) throws Exception{
        throw new Exception("You cannot get change in the idle state");
    }
    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int  productShelfCode) throws Exception{
        throw new Exception("Product cannot be dispensed in the idle state!");
    }
}
