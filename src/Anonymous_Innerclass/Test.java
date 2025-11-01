package Anonymous_Innerclass;

public class Test {
    public static void main(String[] args) {
        Shopping_cart cart=new Shopping_cart(160);
//        Credit_card card=new Credit_card("362352");
//        cart.processPayemnt(card);  This is done by using a separate Credit card class

        // Now we will do, the same using Anonymous Class - On the fly without creating implementation class
        // And we want to extend a class without creating its separate subclass
        // For one time use for implementation class
        cart.processPayemnt((new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+amount +"using Credit card ");
            }
        }));

        cart.processPayemnt(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+amount +"using Paypal. ");
            }
        });
    }
}
