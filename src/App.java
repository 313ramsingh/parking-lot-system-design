
public class App {
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = ParkingLot.ParkingLotGetInstance();
        parkingLot.initlizeParking();
        ParkingLotManager bookParking = new ParkingLotManager();
        bookParking.bookParkingSpace(VehicleType.MOTORCYCLE, "XYZ3927847");
        bookParking.bookParkingSpace(VehicleType.MOTORCYCLE, "XYZ3927897887");
        bookParking.bookParkingSpace(VehicleType.MOTORCYCLE, "XYZ39278607");
        bookParking.bookParkingSpace(VehicleType.MOTORCYCLE, "XYZ392784jh7");
        bookParking.bookParkingSpace(VehicleType.CAR, "XYZ3784700");
        bookParking.bookParkingSpace(VehicleType.TRUCK, "XYZ1233333");

        System.out.println("Id of Parking Space free Up"+bookParking.freeParkingSpace(VehicleType.MOTORCYCLE, "XYZ3927847"));
        System.out.println("Id of Parking Space free Up"+bookParking.freeParkingSpace(VehicleType.MOTORCYCLE, "XYZ3927897887"));
        System.out.println("Id of Parking Space free Up"+bookParking.freeParkingSpace(VehicleType.MOTORCYCLE, "XYZ39278607"));
        System.out.println("Id of Parking Space free Up"+bookParking.freeParkingSpace(VehicleType.MOTORCYCLE, "XYZ392784jh7"));
        System.out.println("Id of Parking Space free Up"+bookParking.freeParkingSpace(VehicleType.CAR, "XYZ3784700"));
        System.out.println("Id of Parking Space free Up"+bookParking.freeParkingSpace(VehicleType.TRUCK, "XYZ1233333"));
    }
}
