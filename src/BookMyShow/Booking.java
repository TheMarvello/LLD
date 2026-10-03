package BookMyShow;
import java.util.List;

public class Booking {
    Show show;
    List<Seat> bookedSeats;
    Payment payment;

    Booking(Show show, List<Seat> bookedSeats, Payment payment){
        this.show = show;
        this.bookedSeats = bookedSeats;
        this.payment = payment;
    }
}
