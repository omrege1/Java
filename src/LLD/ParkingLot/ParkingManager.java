package LLD.ParkingLot;

import LLD.ParkingLot.Model.VehicleConstants.VehicleType;

import java.util.List;

public class ParkingManager {
    ParkingLot lot;
    VehicleType type;
    ParkingManager(ParkingLot lot){
            this.lot = lot;
    }

    public void bookSlot(VehicleType type){
        List<Floor> floors = lot.floors;
        for(Floor floor:floors){
            for(Slot slot : floor.slots){
                if(slot.isFree && slot.type == type){
                    slot.isFree = false;
                    return;
                }
            }
        }

    }
}
