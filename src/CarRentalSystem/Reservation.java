package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;
import CarRentalSystem.Product.VehicleType;

import java.util.Date;

public class Reservation {
    int reservationId;
    Location location;
    User user;
    ReservationStatus reservationStatus;
    Vehicle vehicle;
    Date BookingDate;
    Date BookedFrom;
    Date BookedTo;
    Location pickupLocation;
    Location dropLocation;

    Reservation(int reservationId, Location location, User user, ReservationStatus reservationStatus, Vehicle vehicle, Date bookingDate, Date bookedFrom, Date bookedTo, Location pickupLocation, Location dropLocation) {
        this.reservationId = reservationId;
        this.location = location;
        this.user = user;
        this.reservationStatus = reservationStatus;
        this.vehicle = vehicle;
        BookingDate = bookingDate;
        BookedFrom = bookedFrom;
        BookedTo = bookedTo;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;

    }

    public void closeReservation() {
        this.reservationStatus = ReservationStatus.CLOSED;
        this.vehicle.setAvailability(true);
    }
}
