package LLD.ParkingLot;

import LLD.ParkingLot.Model.VehicleConstants.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    int floorNo;
    List<Slot> slots = new ArrayList<>();

    Floor(int floorNo, int carSlots, int bikeSlots){
        this.floorNo = floorNo;
        int id = 1;
        for(int i=1; i<=carSlots; i++){
            slots.add(new Slot(id, VehicleType.CAR));
            id+=1;
        }

        for(int i=1; i<=bikeSlots; i++){
            slots.add(new Slot(id, VehicleType.BIKE));
            id+=1;
        }
    }
}
