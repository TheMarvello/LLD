package CarRentalSystem;

import CarRentalSystem.Product.VehicleType;

public class Bill {
    Reservation reservation;
    double amount;
    boolean isPaid;

    public void generateBill(Reservation reservation, VehicleType vehicleType, int noOfDays) {
        this.reservation = reservation;
        // Calculate amount based on reservation details
        this.amount = calculateAmount(reservation, vehicleType, noOfDays);
        this.isPaid = false;
    }

    private double calculateAmount(Reservation reservation, VehicleType vehicleType, int noOfDays) {
        if(VehicleType.CAR.equals(vehicleType)) {
            return 500.0 * noOfDays;
        }
        else if(VehicleType.BIKE.equals(vehicleType)) {
            return 200.0 * noOfDays;
        }
        return 0.0;
    }

    public void payBill() {
        this.isPaid = true;
    }
}
