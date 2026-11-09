package ATM.CashWithdrawalProcessor;
import ATM.ATM;
public abstract class CashWithdrawalProcessor  {
    CashWithdrawalProcessor nextProcessor;
    public CashWithdrawalProcessor(CashWithdrawalProcessor next) {
        this.nextProcessor = next;
    }

    public void withdraw(ATM atm, int amount) {
        if(nextProcessor != null) {
            nextProcessor.withdraw(atm, amount);
        }
    }
}
