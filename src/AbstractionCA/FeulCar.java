package AbstractionCA;

public class FeulCar extends car{
    @Override
    public void brake(){
        System.out.println("Fuel Car brake .... ");
    }
    @Override
    public void  accelerate(){
        System.out.println("Fuel Car accelerate .... ");
    }
}
