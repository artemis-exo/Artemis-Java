package AbstractionCA;

public class ElectricCar extends car {
    @Override
    public  void accelerate(){
        System.out.println("Electric Car accelerate .... ");
    }
    @Override
    public  void brake(){
        System.out.println("Electric Car brake .... ");
    }
}
