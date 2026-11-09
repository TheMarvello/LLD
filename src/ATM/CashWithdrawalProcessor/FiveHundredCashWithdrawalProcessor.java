package ATM.CashWithdrawalProcessor;
import ATM.ATM;
public class FiveHundredCashWithdrawalProcessor extends CashWithdrawalProcessor{
    public FiveHundredCashWithdrawalProcessor(CashWithdrawalProcessor next) {
        super(next);
    }
    public void withdraw(ATM atm, int amount) {
        int balance = amount;
        int count = 0;
        while(atm.getFiveHundreds() > 0 && balance >= 500) {
            atm.deductFiveHundreds(1);
            balance -= 500;
            count++;
        }
        System.out.println("No of 500 notes dispensed = "+count);
        if(balance > 0) {
            super.withdraw(atm, balance);
        }
    }
}
