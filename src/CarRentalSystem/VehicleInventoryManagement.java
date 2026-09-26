package CarRentalSystem;

import CarRentalSystem.Product.Car;
import CarRentalSystem.Product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;

    VehicleInventoryManagement(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }

    void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles(){
        return vehicles;
    }


}
