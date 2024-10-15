
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingLotStatus> smallParkingSpace;
    List<ParkingLotStatus> mediumParkingSpace;
    List<ParkingLotStatus> largeParkingSpace;
    static ParkingLot ParkingLotInstance;
    private ParkingLot() {
        //ParkingLotInstance = new ParkingLot();
    }

    public List<ParkingLotStatus> getSmallParkingSpace() {
        return smallParkingSpace;
    }

    public List<ParkingLotStatus> getMediumParkingSpace() {
        return mediumParkingSpace;
    }

    public List<ParkingLotStatus> getLargeParkingSpace() {
        return largeParkingSpace;
    }
   
    public static synchronized ParkingLot ParkingLotGetInstance(){
       if(ParkingLotInstance==null){
        ParkingLotInstance =  new ParkingLot();
       } 
       return ParkingLotInstance;
    }
   
    
    private void initilizeSmallParkingLotSpaces(){
        smallParkingSpace.add(new ParkingLotStatus("", 0, 1));
        smallParkingSpace.add(new ParkingLotStatus("", 0, 2));
        smallParkingSpace.add(new ParkingLotStatus("", 0, 3));
        smallParkingSpace.add(new ParkingLotStatus("", 0, 4));
        smallParkingSpace.add(new ParkingLotStatus("", 0, 5));
        smallParkingSpace.add(new ParkingLotStatus("", 0, 6));
        smallParkingSpace.add(new ParkingLotStatus("", 0, 7));
        smallParkingSpace.add(new ParkingLotStatus("", 0, 8));
        smallParkingSpace.add(new ParkingLotStatus("", 0, 9));
        smallParkingSpace.add(new ParkingLotStatus("", 0, 10));
    }

    private void initilizeMediumParkingLotSpaces(){
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 11));
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 12));
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 13));
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 14));
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 15));
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 16));
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 17));
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 18));
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 19));
        mediumParkingSpace.add(new ParkingLotStatus("", 0, 20));
    }

    private void initilizeLargeParkingLotSpaces(){
        largeParkingSpace.add(new ParkingLotStatus("", 0, 21));
        largeParkingSpace.add(new ParkingLotStatus("", 0, 22));
        largeParkingSpace.add(new ParkingLotStatus("", 0, 23));
        largeParkingSpace.add(new ParkingLotStatus("", 0, 24));
        largeParkingSpace.add(new ParkingLotStatus("", 0, 25));
        largeParkingSpace.add(new ParkingLotStatus("", 0, 26));
        largeParkingSpace.add(new ParkingLotStatus("", 0, 27));
        largeParkingSpace.add(new ParkingLotStatus("", 0, 28));
        largeParkingSpace.add(new ParkingLotStatus("", 0, 29));
        largeParkingSpace.add(new ParkingLotStatus("", 0, 30));
    }
    
    public void initlizeParking() {
        smallParkingSpace = new ArrayList<>();
        mediumParkingSpace = new ArrayList<>();
        largeParkingSpace = new ArrayList<>();
        initilizeLargeParkingLotSpaces();
        initilizeMediumParkingLotSpaces();
        initilizeSmallParkingLotSpaces();
    }

}
