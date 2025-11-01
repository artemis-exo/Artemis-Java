package Generics;

public class Box_main {
    public static void main(String[] args) {
        Box<Integer>box=new Box<Integer>();  // Box is now type safe
        box.setValue(1);
        int i=box.getValue();
        System.out.println(i);
    }
}
