package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int ScreenId;
    String ScreenName;
    List<Seat> seats;

    Screen(int screenId, String screenName, List<Seat> seats){
        this.ScreenId = screenId;
        this.ScreenName = screenName;
        this.seats = seats;
    }

    String getScreenName(){
        return this.ScreenName;
    }

    List<Seat> getSeats(){
        return this.seats;
    }

}
