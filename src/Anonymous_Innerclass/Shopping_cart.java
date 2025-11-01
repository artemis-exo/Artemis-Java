package Anonymous_Innerclass;

public class Shopping_cart {
    private  double totalAmount;

    public Shopping_cart(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void processPayemnt(Payment paymentMethod){ // Interface can be used as reference
        paymentMethod.pay(totalAmount);
    }
}
