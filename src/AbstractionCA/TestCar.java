package AbstractionCA;

public class TestCar {
    public static void main(String[] args) {
        car cf=new FeulCar();
        cf.start();
        cf.brake();
        cf.accelerate();
        System.out.println("Next car");
        car ev=new ElectricCar();
        ev.start();
        ev.brake();
        ev.accelerate();

    }
}
