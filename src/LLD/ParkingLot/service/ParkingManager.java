package LLD.ParkingLot.service;

import LLD.ParkingLot.Model.Floor;
import LLD.ParkingLot.Model.VehicleConstants.VehicleType;
import LLD.ParkingLot.Model.Slot;

import java.util.List;

public class ParkingManager {
    ParkingLot lot;
    VehicleType type;
    public ParkingManager(ParkingLot lot){
            this.lot = lot;
    }

    public void bookSlot(VehicleType type){
        List<Floor> floors = lot.floors;
        for(Floor floor:floors){
            for(Slot slot : floor.slots){
                if(slot.getFree() && slot.getType() == type){
                    slot.setFree(false);
                    return;
                }
            }
        }

    }
}
