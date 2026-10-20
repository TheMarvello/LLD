package VendingMachineLLD;

public enum Coin {
    ONE(1),
    TWO(2),
    FIVE(5);

    public final int value;
    Coin(int value){
        this.value = value;
    }
}
