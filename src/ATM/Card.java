package ATM;

public class Card {
    int atmNo;
    String name;
    BankAccount bankAccount;
    int pin;
    public Card(int atmNo, String name, BankAccount bankAccount, int pin) {
        this.atmNo = atmNo;
        this.name=name;
        this.bankAccount=bankAccount;
        this.pin=pin;
    }
    public int getPin() {
        return pin;
    }
    public BankAccount getBankAccount(){
        return this.bankAccount;
    }

}
