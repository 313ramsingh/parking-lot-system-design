
public class ParkingLotManager {

    public void bookParkingSpace(VehicleType type, String numberPlate) {

        if (type == VehicleType.MOTORCYCLE) {
            bookParkingSpaceImpl(new smallCar(), new smallCarParkingFair(), numberPlate);
        }
        if (type == VehicleType.CAR) {
            bookParkingSpaceImpl(new mediumCar(), new mediumCarParkingFair(), numberPlate);
        }
        if (type == VehicleType.TRUCK) {
            bookParkingSpaceImpl(new largeCar(), new largeCarParkingFair(), numberPlate);
        }

    }

    public String freeParkingSpace(VehicleType type, String numberPlate) {
        return freeParkingSpaceImpl(type, numberPlate);
    }

    private void bookParkingSpaceImpl(ITypeOfCar typeOfCar, ICarParkingFair carParkingFair, String numberPlate) {
        CarTypeStategy car = new CarTypeStategy(carParkingFair, typeOfCar, numberPlate);
        ParkingLotStatus ParkingLotAllocated = car.startAllocatingParkingSpace();
        if (ParkingLotAllocated != null) {
            car.printCarParkingFair();
        } else {
            System.out.println("No Space Available for parking ");
        }
    }

    private String freeParkingSpaceImpl(VehicleType type, String numberPlate) {
        ParkingLot parkingLot = ParkingLot.ParkingLotGetInstance();
        
        String UnparkedParkingLotNumber = "";
        if (type == VehicleType.MOTORCYCLE) {
            for (ParkingLotStatus lotStatus : parkingLot.getSmallParkingSpace()) {
                if (lotStatus.getParkedCarNumber().equals(numberPlate)) {
                    UnparkedParkingLotNumber = lotStatus.getParkedCarNumber();
                    lotStatus.setParkingStatus(1);
                    lotStatus.setParkedCarNumber("");
                    break;
                }
            }
        }
        if (type == VehicleType.CAR) {
            for (ParkingLotStatus lotStatus : parkingLot.getMediumParkingSpace()) {
                if (lotStatus.getParkedCarNumber().equals(numberPlate)) {
                    UnparkedParkingLotNumber = lotStatus.getParkedCarNumber();
                    lotStatus.setParkingStatus(1);
                    lotStatus.setParkedCarNumber("");
                    break;
                }
            }
        }
        if (type == VehicleType.TRUCK) {
            for (ParkingLotStatus lotStatus : parkingLot.getLargeParkingSpace()) {
                if (lotStatus.getParkedCarNumber().equals(numberPlate)) {
                    UnparkedParkingLotNumber = lotStatus.getParkedCarNumber();
                    lotStatus.setParkingStatus(1);
                    lotStatus.setParkedCarNumber("");
                    break;
                }
            }
        }
         
        return UnparkedParkingLotNumber;
    }

}
