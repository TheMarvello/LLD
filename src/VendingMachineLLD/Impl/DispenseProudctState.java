package VendingMachineLLD.Impl;

import VendingMachineLLD.Coin;
import VendingMachineLLD.Product;
import VendingMachineLLD.State;
import VendingMachineLLD.VendingMachine;

import java.util.List;

public class DispenseProudctState implements State {
    public DispenseProudctState(){
        System.out.println("Currently Vending machine is in Dispense Product state!");
    }
    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("You cannot click on insert coin button in the Dispense Product state!");
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        throw new Exception("You cannot click on insert coin button in the Dispense Product state!");
    }
    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("You cannot pressSelectProductButton in the Dispense Product state!");
    }
    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception{
        throw new Exception("You cannot refundFullMoney in the Dispense Product state!");
    }
    @Override
    public void selectProduct(VendingMachine vendingMachine, int productShelfCode) throws Exception{
        throw new Exception("You cannot selectProduct in the Dispense Product state!");
    }
    @Override
    public int returnChange(int change) throws Exception{
        throw new Exception("You cannot returnChange in the Dispense Product state!");
    }
    @Override
    public Product dispenseProduct(VendingMachine vendingMachine, int  productShelfCode) throws Exception{
        vendingMachine.getInventory().dispenseProduct(productShelfCode);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        System.out.println("Product has been dispensed");
        return vendingMachine.getInventory().getProduct(productShelfCode);
    }
}
