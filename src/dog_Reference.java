   // DOG CLASS DEFINITION
    class Dog {
        // ATTRIBUTES (OR FIELDS)
        String name;
        String breed;

        // CONSTRUCTOR TO INITIALIZE dog_Reference OBJECT
        Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        // METHOD THAT PRINTS A SOUND(ACTION)
        void bark() {
            System.out.println("THE SOUND OF DOG IS : WOOF! ");
        }
    }
       // MAIN CLASS WITH dog_Reference METHOD
        public class dog_Reference {
    public static void main(String[] args) {
        // STEP   1: CREATE A Dog OBJECT
        Dog myDog = new Dog("PHOENIX", "GOLDEN RETRIEVER ");

        // STEP 2: CALL THE bark () METHOD
         myDog.bark(); // OUTPUT: WOOF!

        // STEP 3: ACCESS AND PRINT THE name ATTRIBUTE
        System.out.println("THE NAME OF THE DOG IS : " +myDog.name); // OUTPUT: BOLT

        // STEP 4: ACCESS AND PRINT THE breed ATTRIBUTE
        System.out.println("THE NAME OF THE DOG'S BREED IS : " +myDog.breed); // OUTPUT: PHOENIX

    }
}
