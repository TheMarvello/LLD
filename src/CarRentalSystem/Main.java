package CarRentalSystem;

import CarRentalSystem.Product.Car;
import CarRentalSystem.Product.Status;
import CarRentalSystem.Product.Vehicle;
import CarRentalSystem.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Location location = new Location(560048, "Bangalore", "Mahadevpura");
        Store store = new Store(1, "Mahadevpura1", new VehicleInventoryManagement(new ArrayList<>()), location);
        CarRentalSystem carRentalSystem = new CarRentalSystem(new ArrayList<>(), new ArrayList<>());

        carRentalSystem.addStore(store);
        store.vehicleInventoryManagement.addVehicle(new Car(1, "KA9090", VehicleType.CAR, Status.ACTIVE, true));

        User user1 = new User(1, "John Doe", "DL12345");
        carRentalSystem.addUser(user1);

        Store foundStore = carRentalSystem.getStore(location);

        List<Vehicle> availableVehicles = foundStore.vehicleInventoryManagement.getVehicles();
        System.out.println("Available vehicles at store " + foundStore.storeName + ":");

        Reservation reservation = new Reservation(1, location, user1, ReservationStatus.COMPLETED, availableVehicles.get(0), new java.util.Date(), new java.util.Date(), new java.util.Date(), location, location);






    }
}
