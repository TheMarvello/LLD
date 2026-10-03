package BookMyShow;

import java.util.List;

public class Show {
    int showId;
    Movie movie;
    public Screen screen;
    public int showTime;
    List<Seat> bookedSeats;

    Show(int showId, Movie movie, Screen screen, int showTime, List<Seat> bookedSeats){
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.showTime = showTime;
        this.bookedSeats = bookedSeats;
    }

    public List<Seat> getAvailableSeats(){
        List<Seat> availableSeats = screen.getSeats();
        availableSeats.removeAll(bookedSeats);
        return availableSeats;
    }
    public void bookSeat(Seat seat){
        bookedSeats.add(seat);
    }
    public Movie getMovie(){
        return movie;
    }
}
