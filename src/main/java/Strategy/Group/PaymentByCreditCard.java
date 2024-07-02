package Strategy.Group;

import Strategy.CreditCard;

public class PaymentByCreditCard implements PaymentInterface {
    private CreditCard card;


    @Override
    public void collectPaymentDetails() {
     card = new CreditCard("cardNumber","expiryDate","cvv");
        System.out.println("Collecting Card Details");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Card Details" +card);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+"using credit Card");
        card.setAmount(card.getAmount() - amount);
    }
}
