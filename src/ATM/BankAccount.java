package ATM;

public class BankAccount {
    String bankName;
    Double balance;
    String name;
    long accountNo;

    public BankAccount(String bankName, Double balance, String name, long accountNo) {
        this.accountNo=accountNo;
        this.balance=balance;
        this.bankName=bankName;
        this.name=name;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return this.balance;
    }
}
