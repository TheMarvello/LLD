package ATM;

public enum TransactionType {
    SHOW_BALANCE,
    CASH_WITHDRAWAL;

    public static void showALLTransactions(){
        for(TransactionType type: TransactionType.values()){
            System.out.println(type.name());
        }
    }
}
