package CarRentalSystem;

public class Location {
    int Pincode;
    String LocationName;
    String LocationAddress;

    Location(int Pincode, String LocationName, String LocationAddress){
        this.Pincode = Pincode;
        this.LocationName = LocationName;
        this.LocationAddress = LocationAddress;
    }

    String getLocationName(){
        return this.LocationName;
    }

    String getLocationAddress(){
        return this.LocationAddress;
    }

    String getPincode(){
        return String.valueOf(this.Pincode);
    }
}
