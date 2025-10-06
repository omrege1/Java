package LLD.ParkingLot;

import LLD.ParkingLot.Model.VehicleConstants.VehicleType;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance(2);
        ParkingManager parkingManager = new ParkingManager(parkingLot);
        parkingManager.bookSlot(VehicleType.CAR);
        parkingManager.bookSlot(VehicleType.BIKE);
        parkingManager.bookSlot(VehicleType.BIKE);

        for(Floor f : parkingLot.floors){
            for(Slot s : f.slots){
                System.out.println("Availability of slots " + s.isFree + s.id);
            }

        }

    }
}
