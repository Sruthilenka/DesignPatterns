package Strategy.Group;

public interface PaymentInterface {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
