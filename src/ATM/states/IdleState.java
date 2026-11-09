package ATM.states;

import ATM.ATM;
import ATM.Card;

public class IdleState extends ATMState {
    public IdleState() {
        System.out.println("ATM is in idle state!!! \nYou can insert your card to get started!!");
    }
    public void insertCard(ATM atm, Card card){
        System.out.println("Card is inserted!!");
        atm.setATMState(new HasCardState());
    }
}
