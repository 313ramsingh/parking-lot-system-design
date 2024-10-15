
public class smallCar implements ITypeOfCar {

    @Override
    public ParkingLotStatus carType(String vehcileNumber) {
        System.out.println("Finding parking sapce for Small car");
        ParkingLot parkingLot = ParkingLot.ParkingLotGetInstance();
        
        ParkingLotStatus storeEmptyParkingLot = null;
        for (ParkingLotStatus lotStatus : parkingLot.getSmallParkingSpace()) {
            if (lotStatus.getParkingStatus() == 0) {
                storeEmptyParkingLot = lotStatus;
                break;
            }
        }
        if (storeEmptyParkingLot != null) {
            System.out.println("Parking No of allocated space: " + storeEmptyParkingLot.getParkingLotNumber());
            storeEmptyParkingLot.setParkingStatus(1);
            storeEmptyParkingLot.setParkedCarNumber(vehcileNumber);
        }
        return storeEmptyParkingLot;
    }

}
