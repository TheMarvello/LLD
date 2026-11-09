package ATM.states;

import ATM.ATM;
import ATM.Card;
import ATM.TransactionType;


public abstract class ATMState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("This operation is not supported at this stage!!");
    }
    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("This operation is not supported at this stage!!");
    }
    public void selectOperation(ATM atm, Card card, TransactionType txnType ) {
        System.out.println("This operation is not supported at this stage!!");
    }
    public void cashWithdrawal(ATM atm, Card card, int amount) {
        System.out.println("This operation is not supported at this stage!!");
    }
    public void displayBalance(ATM atm, Card card) {
        System.out.println("This operation is not supported at this stage!!");
    }
    public void returnCard(){
        System.out.println("This operation is not supported at this stage!!");
    }
    public void exit(ATM atm){
        System.out.println("This operation is not supported at this stage!!");
    }
}
