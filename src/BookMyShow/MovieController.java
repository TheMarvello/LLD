package BookMyShow;

import BookMyShow.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityToMoviesMap;
    List<Movie> allMovies;

    MovieController(){
        cityToMoviesMap = new HashMap<>();
        allMovies = new ArrayList<>();
    }
    MovieController(Map<City, List<Movie>> cityToMoviesMap, List<Movie> allMovies){
        this.cityToMoviesMap = cityToMoviesMap;
        this.allMovies = allMovies;
    }

    List<Movie> getMoviesByCity(City city){
        return cityToMoviesMap.get(city);
    }

    List<Movie> getAllMovies(){
        return allMovies;
    }

    public void addMovies(City city, Movie movie){
        allMovies.add(movie);
        if(cityToMoviesMap.get(city) == null){
            cityToMoviesMap.put(city, new ArrayList<Movie>());
        }
        cityToMoviesMap.get(city).add(movie);
    }
    public Movie getMovieByName(String movieName){
        for(Movie movie: allMovies){
            if(movie.getName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }
}
