package ATM.states;

import ATM.ATM;
import ATM.TransactionType;
import ATM.Card;

public class selectOperationState extends ATMState{
    public selectOperationState() {
        showAllOperations();
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        switch(txnType) {
            case SHOW_BALANCE:
                atm.setATMState(new CheckBalanceState());
                break;
            case CASH_WITHDRAWAL:
                atm.setATMState(new CashWithdrawalState());
                break;
            default:
                System.out.println("Invalid Operation!");
                exit(atm);
        }
    }

    private void showAllOperations() {
        System.out.println("Select transaction");
        TransactionType.showALLTransactions();
    }
    public void exit(ATM atm) {
        returnCard();
        atm.setATMState(new IdleState());
        System.out.println("Exit successful!!");
    }
    public void returnCard() {
        System.out.println("Please collect your card!!");
    }
}
