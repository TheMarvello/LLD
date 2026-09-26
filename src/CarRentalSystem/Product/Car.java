package CarRentalSystem.Product;

public class Car extends Vehicle{

    Car(int id, int vehicleNo, VehicleType vehicleType, Status status, boolean isAvailable){
        super(id, vehicleNo, vehicleType, status, isAvailable);
    }
}
