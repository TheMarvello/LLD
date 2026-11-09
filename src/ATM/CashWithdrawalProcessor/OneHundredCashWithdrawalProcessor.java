package ATM.CashWithdrawalProcessor;

import ATM.ATM;

public class OneHundredCashWithdrawalProcessor extends CashWithdrawalProcessor{
    public OneHundredCashWithdrawalProcessor(CashWithdrawalProcessor next) {
        super(next);
    }
    public void withdraw(ATM atm, int amount) {
        int balance = amount;
        int count = 0;
        while(balance > 0 && atm.getOneHundreds() >= 0 ){
            balance -= 100;
            atm.deductOneHundreds(1);
            count++;
        }
        System.out.println("No of 100 rupee notes dispensed = "+ count);
        if(balance > 0) {
            System.out.println("Something went wrong!!");
        }
    }
}
