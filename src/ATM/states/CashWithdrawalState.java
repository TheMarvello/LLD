package ATM.states;

import ATM.ATM;
import ATM.Card;
import ATM.CashWithdrawalProcessor.CashWithdrawalProcessor;
import ATM.CashWithdrawalProcessor.FiveHundredCashWithdrawalProcessor;
import ATM.CashWithdrawalProcessor.OneHundredCashWithdrawalProcessor;

public class CashWithdrawalState extends ATMState{
    public void cashWithdrawal(ATM atm, Card card, int amount) {
        System.out.println("Amount to withdraw : "+amount);
        if(card.getBankAccount().getBalance() < amount) {
            System.out.println("Insufficient account balance!!!");
            exit(atm);
        } else if(atm.getBalance() < amount){
            System.out.println("Insufficient Balance in the ATM!!");
            exit(atm);
        } else {
            card.getBankAccount().setBalance(card.getBankAccount().getBalance()-amount);
            atm.setBalance(atm.getBalance()-amount);

            //dispense through chain of responsibility
            CashWithdrawalProcessor cashWithdrawalProcessor = new FiveHundredCashWithdrawalProcessor(new OneHundredCashWithdrawalProcessor(null));
            cashWithdrawalProcessor.withdraw(atm, amount);
            System.out.println("please collect your cash now!!");
            exit(atm);
        }
    }

    public void exit(ATM atm) {
        System.out.println("Exit successful!!");
        returnCard();
        atm.setATMState(new IdleState());
    }
    public void returnCard(){
        System.out.println("Please collect your Card!!!");
    }
}
