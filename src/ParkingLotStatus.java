
public class ParkingLotStatus {

    private String parkedCarNumber;
    private int parkingStatus;
    private int parkingLotNumber;

    public String getParkedCarNumber() {
        return parkedCarNumber;
    }

    public void setParkedCarNumber(String parkedCarNumber) {
        this.parkedCarNumber = parkedCarNumber;
    }

    public int getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(int parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public int getParkingLotNumber() {
        return parkingLotNumber;
    }

    public void setParkingLotNumber(int parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }

    public ParkingLotStatus(String parkedCarNumber, int parkingStatus, int parkingLotNumber) {
        this.parkedCarNumber = parkedCarNumber;
        this.parkingStatus = parkingStatus;
        this.parkingLotNumber = parkingLotNumber;
    }

}
