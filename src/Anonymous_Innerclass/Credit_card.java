package Anonymous_Innerclass;

public class Credit_card implements Payment {

    private  String creditCardNumber;

    public Credit_card(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount +"using Credit card ");
    }
}
