package CarRentalSystem.Product;

public class Car extends Vehicle{

    public Car(int id, String vehicleNo, VehicleType vehicleType, Status status, boolean isAvailable){
        super(id, vehicleNo, vehicleType, status, isAvailable);
    }
}
