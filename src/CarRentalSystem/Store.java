package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    String storeName;
    VehicleInventoryManagement vehicleInventoryManagement;
    Location location;
    List<Reservation> reservations;

    Store(int storeId, String storeName, VehicleInventoryManagement vehicleInventoryManagement, Location location){
        this.storeId = storeId;
        this.storeName = storeName;
        this.vehicleInventoryManagement = vehicleInventoryManagement;
        this.location = location;
        this.reservations = new ArrayList<>();
    }
}
