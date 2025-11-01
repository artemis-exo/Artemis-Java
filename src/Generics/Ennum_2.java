package Generics;

enum OPerations{
    ADD,SUBTRACT,MULTIPLY,DIVIDE;

    public <T extends Number>double apply(T a, T b){
        switch (this){
            case ADD:
                return a.doubleValue()+ b.doubleValue();
            case SUBTRACT:
                return a.doubleValue()- b.doubleValue();
            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();
            case DIVIDE:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new AssertionError("Unknown operations: "+this);
        }
    }
}

public class Ennum_2 {
    public static void main(String[] args) {

        double res=OPerations.ADD.apply(10,20);
        double res1=OPerations.MULTIPLY.apply(34,89);
        System.out.println(res);
        System.out.println(res1);

    }

}
