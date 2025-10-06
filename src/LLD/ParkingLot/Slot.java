package LLD.ParkingLot;

import LLD.ParkingLot.Model.VehicleConstants.VehicleType;

public class Slot {
    int id;
    boolean isFree = true;
    VehicleType type;

    Slot(int id, VehicleType type){
        this.id = id;
        this.type = type;
    }
}
