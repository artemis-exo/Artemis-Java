package Animal;

public class test_run {
    public static void main(String[] args) {
       /* Dogyy dog=new Dogyy();
        Cat cat=new Cat();   //HIERARCHIAL INHERITENCE
        dog.setName("PHOENIX ");
        dog.setAge(4);
        dog.eat();
        dog.sayHello();*/
        Animal myAnimal= new Animal();
        myAnimal.sayHello();
    // Run time Polymorphism
        Animal dog=new Dogyy();  // We can give parent class reference  // also called UPCASTING
        dog.sayHello();  // but output will be form dog object

        Animal kitty =new Cat();
        kitty.sayHello();     // but output will be form dog object

        Dogyy myDog=(Dogyy)dog;
    }
}
