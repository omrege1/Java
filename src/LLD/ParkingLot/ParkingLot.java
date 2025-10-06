package LLD.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    List<Floor> floors = new ArrayList<>();

    private ParkingLot(int numFloors){
        for(int i=1; i<=numFloors; i++){
            floors.add(new Floor(1,10, 10));
        }
    }

    public static ParkingLot getInstance(int numFloors){
        if(instance == null){
            return new ParkingLot(numFloors);
        }
        return instance;
    }


}
