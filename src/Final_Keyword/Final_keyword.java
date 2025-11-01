package Final_Keyword;

public class Final_keyword extends Final_vehcile {  // Class can also be Final ,then we cannot extend it's class
    private final int speedLimit=200;  // We cannot change or Set the value of variable if Final keyword is added

    public  int getSpeedLimit() {
        return speedLimit;  // we cannot use This keyword here and assign beacuse it changes to a current value
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void deaccelearte() {

    }
    public void airBags(){
        System.out.println("4 Air Bags");  // If we add final before void we cannot change the Air bags in Ev_car class method.
    }
}
