package ATM.states;
import ATM.Card;
import ATM.ATM;

public class CheckBalanceState extends ATMState{
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your account balance is: "+card.getBankAccount().getBalance());
        exit(atm);
    }

    public void exit(ATM atm) {
        System.out.println("Exit successful!!!");
        returnCard();
        atm.setATMState(new IdleState());
    }

    public void returnCard() {
        System.out.println("Please collect your card!!");
    }
}
