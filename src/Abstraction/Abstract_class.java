package Abstraction;

abstract class Hello {
    abstract void sound();

    void display(){
        System.out.println("This is to print");
    }

}

class A extends Hello{

    @Override
    void sound() {
        System.out.println("A is making a sound");
    }
}
class Abstract_class{
    public static void main(String[] args) {
        A se=new A();
        se.sound();
        se.display();
    }
}