
public class largeCar implements ITypeOfCar {

    @Override
    public ParkingLotStatus carType(String vehcileNumber) {
        System.out.println("Finding parking sapce for Large Vehcile");
        ParkingLot parkingLot = ParkingLot.ParkingLotGetInstance();
        ParkingLotStatus storeEmptyParkingLot = null;
        for (ParkingLotStatus lotStatus : parkingLot.getLargeParkingSpace()) {
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
