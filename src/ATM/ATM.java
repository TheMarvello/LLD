package ATM;

import ATM.states.ATMState;

public class ATM {
    int id;
    int balance;
    ATMState state;
    int fiveHundreds;
    int oneHundreds;

    ATM(int id, int balance, ATMState state, int fiveHundreds, int oneHundreds) {
        this.id = id;
        this.balance=balance;
        this.state = state;
        this.fiveHundreds=fiveHundreds;
        this.oneHundreds=oneHundreds;
    }
    public void setATMState(ATMState state){
        this.state = state;
    }
    public ATMState getATMState() {
        return state;
    }
    public void setBalance(int balance) {
        this.balance=balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getFiveHundreds(){
        return fiveHundreds;
    }
    public void deductFiveHundreds(int count) {
        fiveHundreds -= count;
        setBalance(getBalance()-500*count);
    }
    public int getOneHundreds(){
        return oneHundreds;
    }
    public void deductOneHundreds(int count) {
        oneHundreds -= count;
        setBalance(getBalance()-100*count);
    }
}
