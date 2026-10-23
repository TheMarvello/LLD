package VendingMachineLLD.Impl;

import VendingMachineLLD.*;

import java.util.List;

public class SelectionState implements State {
    public SelectionState(){
        System.out.println("Currently Vending machine is in selection state!");
    }
    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("You cannot click on insert coin button in the Selection state!");
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        throw new Exception("You cannot click on insert coin button in the Selection state!");
    }
    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception{
        return;
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
        //1. get product by the productShelfNumber
        Product product = vendingMachine.getInventory().getProduct(productShelfCode);

        //2. calc total amount paid by user
        int paidByUser = 0;
        for(Coin coin: vendingMachine.getCoinList()){
            paidByUser += coin.value;
        }

        //3. compare product pricer and amount paid by user
        if(paidByUser < product.getPrice()) {
            System.out.println("Insufficient amount, product cannot be dispensed. Retry again!!");
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficeint amount!");
        } else {
            if(paidByUser > product.getPrice()) returnChange(paidByUser-product.getPrice());
            vendingMachine.setVendingMachineState(new DispenseProudctState());
        }
    }
    @Override
    public int returnChange(int change) throws Exception{
        System.out.println("Please collect the change of "+ change+  " in the dispense tray");
        return change;
    }
    @Override
    public Product dispenseProduct(VendingMachine vendingMachine, int  productShelfCode) throws Exception{
        throw new Exception("Product cannot be dispensed in the Selection state!!");
    }
}
