package BookMyShow;

import BookMyShow.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityToTheatresMap;
    List<Theatre> allTheatres;

    TheatreController(){
        this.cityToTheatresMap = new HashMap<City, List<Theatre>>();
        this.allTheatres = new ArrayList<Theatre>();
    }
    public void addTheatre(Theatre theatre){
        allTheatres.add(theatre);
        if(!cityToTheatresMap.containsKey(theatre.getCity())){
            cityToTheatresMap.put(theatre.getCity(), new ArrayList<Theatre>());
        }
        cityToTheatresMap.get(theatre.getCity()).add(theatre);
    }

    List<Theatre> getTheatresByCity(City city){
        return cityToTheatresMap.get(city);
    }
    Theatre getTheatreByName(String theatreName){
        for(Theatre theatre: allTheatres){
            if(theatre.getTheatreName().equals(theatreName)){
                return theatre;
            }
        }
        return null;
    }
    List<Show> getShowsByMovie(Movie movie, City city){
        List<Show> showsByMovie = new ArrayList<>();
        List<Theatre> theatres = getTheatresByCity(city);
        for(Theatre theatre: theatres){
            List<Show> shows = theatre.getShowsByMovie(movie);
            showsByMovie.addAll(shows);
        }
        return showsByMovie;
    }
}
