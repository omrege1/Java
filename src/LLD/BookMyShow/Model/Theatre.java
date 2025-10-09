package LLD.BookMyShow.Model;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private String theatreName;
    private List<Screen> screens = new ArrayList<>();
    Theatre(int noOfScreens){
        for(int i=1; i<=noOfScreens; i++){
            screens.add(new Screen(1,60));
        }
    }
}
