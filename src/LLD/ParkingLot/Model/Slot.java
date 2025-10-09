package LLD.ParkingLot.Model;

import LLD.ParkingLot.Model.VehicleConstants.VehicleType;

public class Slot {
    private int id;
    private boolean isFree = true;
    private VehicleType type;

    Slot(int id, VehicleType type){
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean getFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
