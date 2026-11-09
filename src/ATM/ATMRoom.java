package ATM;

import ATM.states.ATMState;
import ATM.states.IdleState;

public class ATMRoom {


    public static void main(String[] args) {
        ATM atm = new ATM(1, 3400, new IdleState(), 6, 4);
        Card card = new Card(12344321, "Damian", new BankAccount("HDFC", 1400.0, "Damian", 12344321), 1234);
        atm.getATMState().insertCard(atm, card);
        atm.getATMState().authenticatePin(atm, card, 1234);
//        atm.getATMState().selectOperation(atm, card, TransactionType.SHOW_BALANCE);
//        atm.getATMState().displayBalance(atm, card);
        atm.getATMState().selectOperation(atm, card, TransactionType.CASH_WITHDRAWAL);
        atm.getATMState().cashWithdrawal(atm, card, 1400);
    }
}
