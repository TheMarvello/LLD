package CarRentalSystem.Product;

public class Vehicle {
    int id;
    String vehicleNo;
    VehicleType vehicleType;
    Status status;
    boolean isAvailable;

    Vehicle(int id, String vehicleNo, VehicleType vehicleType, Status status, boolean isAvailable) {
        this.id = id;
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.status = status;
        this.isAvailable = isAvailable;
    }

    void setStatus(Status status) {
        this.status = status;
    }
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
