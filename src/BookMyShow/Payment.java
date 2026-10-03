package BookMyShow;

import BookMyShow.Enum.PaymentType;

public class Payment {
    int id;
    double amount;
    PaymentType paymentType;

    Payment(int id, double amount, PaymentType paymentType){
        this.id = id;
        this.amount = amount;
        this.paymentType = paymentType;
    }
}
