package BookMyShow;

import BookMyShow.Enum.City;
import BookMyShow.Enum.PaymentType;
import BookMyShow.Enum.SeatCategory;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;

    BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    void initialize(){
        addMovies();
        addTheatres();
        addShows();
    }
    void addMovies(){
        Movie movie1 = new Movie(1, "SpiderMan-1", 120);
        Movie movie2 = new Movie(2, "Avengers", 130);

        movieController.addMovies(City.BANGALORE, movie1);
        movieController.addMovies(City.BANGALORE, movie2);
    }
    void addTheatres(){
        Theatre theatre1 = new Theatre(1, "PVR", "Forum Mall, Kormangla",City.BANGALORE, createScreens());
        Theatre theatre2 = new Theatre(2, "INOX", "Pheonix Marketcity, Mahadevpura", City.BANGALORE, createScreens());
        theatreController.addTheatre(theatre1);
        theatreController.addTheatre(theatre2);

    }
    List<Screen> createScreens(){
        List<Screen> screens = new ArrayList<>();
        Screen Screen1 = new Screen(1, "Screen-1", createSeats());
        Screen screen2 = new Screen(2, "Screen-2", createSeats());
        screens.add(Screen1);
        screens.add(screen2);
        return screens;

    }
    List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();
        for(int i =1; i<=10; i++) {
            Seat seat = new Seat(i, 1, SeatCategory.SILVER, 100);
            seats.add(seat);
        }
        for(int i = 11; i<=20; i++){
            Seat seat = new Seat(i, 2, SeatCategory.GOLD, 200);
            seats.add(seat);
        }
        for(int i = 21; i<=30; i++) {
            Seat seat = new Seat(i, 3, SeatCategory.PLATINUM, 300);
            seats.add(seat);
        }
        return seats;
    }
    private void addShows(){
        Show show1 = new Show(1, movieController.getMovieByName("SpiderMan-1"), theatreController.getTheatreByName("PVR").getScreens().getFirst(), 10, new ArrayList<>());

        Show show2 = new Show(2, movieController.getMovieByName("Avengers"), theatreController.getTheatreByName("INOX").getScreens().getFirst(),10, new ArrayList<>());

        Show show3 = new Show(3, movieController.getMovieByName("SpiderMan-1"), theatreController.getTheatreByName("PVR").getScreens().getFirst(), 16, new ArrayList<>());

        theatreController.getTheatreByName("PVR").addShow(show1);
        theatreController.getTheatreByName("INOX").addShow(show2);
        theatreController.getTheatreByName("PVR").addShow(show3);
    }

    private void createBooking(City userCity, String movieName){

        //search movies by location
        List<Movie> movies = movieController.getMoviesByCity(userCity);
        System.out.println("Movies available in " + userCity + " are: ");
        for(Movie movie : movies){
            System.out.println(movie.getName());
        }

        //select the movie which you want to see
        Movie selectedMovie =null;
        for(Movie movie: movies){
            if(movie.getName().equals(movieName)){
                selectedMovie = movie;
            }
        }

        //get all shows for the selected movie
        List<Show> shows = theatreController.getShowsByMovie(selectedMovie, userCity);
        System.out.println("Shows available for " + selectedMovie.getName() + " in " + userCity + " are: ");
        for(Show show : shows){
            System.out.println(show.showTime + " at " + show.screen.getScreenName());
        }

        //user selects a show
        Show selectedShow = shows.get(0);
        System.out.println("Selected Show: " + selectedShow.showTime + " at " + selectedShow.screen.getScreenName());

        //select a seat
        Seat selectedSeat = selectedShow.getAvailableSeats().get(0);
        System.out.println("Selected Seat: " + selectedSeat.getSeatId() + " in " + selectedSeat.getSeatCategory());

        selectedShow.bookSeat(selectedSeat);
        Booking booking = new Booking(selectedShow, List.of(selectedSeat), new Payment(1, 100, PaymentType.UPI));

        System.out.println("Booking successful");
    }

    public static void main(String[] args){
        System.out.println("Welcome to BookMyShow!!!!!!!!!!!");
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();
        bookMyShow.createBooking(City.BANGALORE, "SpiderMan-1");
    }
}
