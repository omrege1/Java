package LLD.BookMyShow.Model;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int screenNo;
    List<Seat> seats = new ArrayList<>();

    Screen(int screenNo, int noOfSeats){
        this.screenNo = screenNo;
        for(int i=1; i<=noOfSeats; i++){
            seats.add(new Seat(true, i));
        }
    }
}
