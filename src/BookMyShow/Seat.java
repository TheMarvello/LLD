package BookMyShow;

import BookMyShow.Enum.SeatCategory;

public class Seat {
    int seatId;
    int row;
    SeatCategory seatCategory;
    int price;

    Seat(int seatId, int row, SeatCategory seatCategory, int price){
        this.seatId = seatId;
        this.row = row;
        this.seatCategory = seatCategory;
        this.price = price;
    }

    int getSeatId(){
        return this.seatId;
    }

    int getRow(){
        return this.row;
    }

    SeatCategory getSeatCategory(){
        return this.seatCategory;
    }

    int getPrice(){
        return this.price;
    }

}
