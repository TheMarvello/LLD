package NullObjectDesignPattern;

public class Main {
    public static void main(String [] args){
        Vehicle vehicle1 = VehicleFactory.create("Bike");
        printVechileDetails(vehicle1);
        Vehicle vehicle2 = VehicleFactory.create("CAR");
        printVechileDetails(vehicle2);
    }
    private static void printVechileDetails(Vehicle vechile){
        System.out.println("Seating Capacity: "+vechile.getSeatingCapacity());
        System.out.println("Fuel tank Capacity: "+vechile.getTankCapacity());
    }

}

