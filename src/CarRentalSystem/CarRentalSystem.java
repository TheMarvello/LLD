package CarRentalSystem;

import java.util.List;

public class CarRentalSystem {
    List<User> users;
    List<Store> stores;

    CarRentalSystem(List<User> users, List<Store> stores){
        this.users = users;
        this.stores = stores;
    }
    public Store getStore(Location location){
        for(Store store: stores){
            if(store.location.getPincode().equals(location.getPincode())){
                return store;
            }
        }
        return null;
    }
    public void addStore(Store store){
        this.stores.add(store);
    }
    public void addUser(User user){
        this.users.add(user);
    }
}
