package BookMyShow;

public class Movie {
    int id;
    String name;
    int durationInMins;

    Movie(int id, String name, int durationInMins){
        this.id = id;
        this.name = name;
        this.durationInMins = durationInMins;
    }

    public String getName(){
        return this.name;
    }
    public int getDurationInMins(){
        return this.durationInMins;
    }
}
