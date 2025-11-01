package Interface;

import Multiple_inheritence.Smartphone;
// We can also run main method in Interface
public class test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        cat kit=new cat();
        dog.eat();
        dog.sleep();
        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);// Can also be accessed from interface
        Animal.info();
        dog.run();  // Not animal.run beacuse it is not a static method
        kit.run();

        Smartphone smartphone=new Smartphone();
        smartphone.makeCall("8979474371");
        smartphone.endCall();
        smartphone.playMusic();
        smartphone.stopMusic();
        smartphone.takePhoto();
        smartphone.takeVid();
    }
}
