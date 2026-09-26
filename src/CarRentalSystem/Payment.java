package CarRentalSystem;

public class Payment {
    Bill bill;
    PaymentMode paymentMode;
    public void payBill(Bill bill, PaymentMode paymentMode) {
        this.bill = bill;
        bill.payBill();
    }
}
