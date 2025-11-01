package Abstraction;

public class Test_run {
    public static void main(String[] args) {
      //  Animal ani=new Animal();   // We cannot create abstract class object
      //  Dog dog=new Dog();
          // OR
        Animal dog=new Dog();// But we can give reference of parent class
        dog.sayHello();


    }
}
