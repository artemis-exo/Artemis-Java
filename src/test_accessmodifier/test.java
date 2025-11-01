package test_accessmodifier;

import Access_modifier.school.School;
import Access_modifier.school.Student;
import Protected_Zoo.Dog;

public class test {
    public static void main(String[] args) {
        //Student student = new Student();     // Public class
//        student.age = 12;
//        student.name = "Vedaant";
//        student.sayHello();
        Student.sayBye();  // Because of static we connected it with the Student class and calls it directly form class
        School.getInstance();  // Cannot access School class if the access modifier is default
        Dog dog =new Dog("Montu ");
        dog.makeSound();
        dog.setDogSound("WOOF! ");
        dog.makeSound();
        dog.wagTail();

    }
}
