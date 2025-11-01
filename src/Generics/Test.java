package Generics;

interface Printable{
    void print();
}
class MyNumber extends Number implements Printable{

    private final int value;

    public MyNumber(int value){
        this.value=value;
    }

    @Override
    public void print() {

    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
class Boxx<T extends Number & Printable>{
    private  T ite;

    public Boxx(T item){
        this.ite=item;
    }
    public void display(){
        ite.print();
    }
}

public class Test {
    public static void main(String[] args) {
        MyNumber myNum=new MyNumber(14);
        Boxx<MyNumber>box=new Boxx<MyNumber>(myNum);
        box.display();
    }
}
