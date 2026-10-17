package NullObjectDesignPattern;

public class VehicleFactory {
    public static Vehicle create(String vehicleType){
        if(vehicleType.equals("CAR")){
            return new Car();
        }
        else {
            return new NullVehicle();
        }
    }
}
