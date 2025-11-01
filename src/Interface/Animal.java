package Interface;
// Through ,Interface we can achieve Multiple Inheritance
// Two Use Cases
// 1. Multiple Inheritance
// 2. Abstraction
// Blueprints for class : 1. Abstract methods   2. Static constants
// Interfaces can we default and static methods also
// Note - Interface abstract methods cannot have a body, We have to add Static before void to make body
// Try on making Utils Interface on package static
// We can take reference of Interface but cannot create Objects of Interface

public interface Animal {

    public static  final int MAX_AGE =140;   //In Interface public and static are redundant
    public abstract void eat();

    void sleep();// In Interface public and abstract are redundant

     public static void info(){
         System.out.println("This is an Animal interface ");
     }
     public default void run(){   // We do not have to make it implement , because implement class inherit default
         this.eat();
         System.out.println("Amimal is running");
     }
}