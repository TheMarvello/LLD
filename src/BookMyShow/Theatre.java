package BookMyShow;

import BookMyShow.Enum.City;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int theatreId;
    String theatreName;
    String theatreAddress;
    City city;
    List<Screen> screens;
    List<Show> shows;

    Theatre(int theatreId, String theatreName, String theatreAddress, City city, List<Screen> screens){
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.theatreAddress = theatreAddress;
        this.city = city;
        this.screens = screens;
        this.shows = new ArrayList<>();
    }

    List<Screen> getScreens(){
        return screens;
    }

    List<Show> getShows(){
        return shows;
    }

    City getCity(){
        return city;
    }
    String getTheatreName(){
        return theatreName;
    }
    public void addShow(Show show){
        shows.add(show);
    }
    List<Show> getShowsByMovie(Movie movie){
        List<Show> shortlistedShows= new ArrayList<>();
        for(Show show: shows){
            if(show.getMovie().equals(movie)){
                shortlistedShows.add(show);
            }
        }
        return shortlistedShows;
    }
}
