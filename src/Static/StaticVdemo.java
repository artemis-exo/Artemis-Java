package Static;

class Mobile{

        String brand;
        int price;
       static String name; // is used to keep common for all the objects
// Static variable is shared by all the objects of the class
    // Static variable can also be called using class name
        public void show(){
            System.out.println(brand +" : "+ price+ " : "+ name);
        }
    }
public class StaticVdemo {
    public static void main(String[] args) {
        Mobile mob1=new Mobile();
        mob1.brand="Apple";
        mob1.price=120000;
        mob1.name="SmartPhone";

        Mobile mob2=new Mobile();
        mob2.brand="Samsung";
        mob2.price=140000;
        Mobile.name="SmartPhone"; // Calling by class name

        mob1.name="Tablet"; // Both will get changed

        mob1.show();;
        mob2.show();

    }
}

