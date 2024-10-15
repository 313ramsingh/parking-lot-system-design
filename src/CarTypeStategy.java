public class CarTypeStategy {
     ICarParkingFair cpf;
     ITypeOfCar toc;
     String numberPlate;

     CarTypeStategy(ICarParkingFair cpf, ITypeOfCar toc,String numberPlate){
         this.cpf = cpf;
         this.toc = toc;
         this.numberPlate = numberPlate;
     }

     public void printCarParkingFair(){
        this.cpf.parkingFair();
     }

     public ParkingLotStatus startAllocatingParkingSpace(){
        return this.toc.carType(numberPlate);
     }

    public String getNumberPlate() {
        return numberPlate;
    }

}
