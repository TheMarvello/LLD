package CarRentalSystem.Product;

public class Bike extends Vehicle{
    Bike(int id, String vehicleNo, VehicleType vehicleType, Status status, boolean isAvailable){
        super(id, vehicleNo, vehicleType, status, isAvailable);
    }
}
