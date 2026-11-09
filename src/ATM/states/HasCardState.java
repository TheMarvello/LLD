package ATM.states;

import ATM.ATM;
import ATM.Card;

public class HasCardState extends ATMState{
    public void authenticatePin(ATM atm, Card card, int pin) {
        if(pin == card.getPin()){
            System.out.println("Card authenticated!!");
            atm.setATMState(new selectOperationState());
        } else {
            System.out.println("Incorrect pin");
            exit(atm);
        }
    }
    public void returnCard() {
        System.out.println("Please collect your card!!");
    }
    public void exit(ATM atm) {
        atm.setATMState(new IdleState());
        returnCard();
        System.out.println("Exit operation completed!!");
    }
}
