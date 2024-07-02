package Strategy.Group;

public class PaymentByPaypal implements PaymentInterface{
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        email="PayPal Mail";
        password = "Paypal Password";
        System.out.println("Collecting Paypal Account Details");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Paypal account details");
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount +"using Paypal");
    }
}
