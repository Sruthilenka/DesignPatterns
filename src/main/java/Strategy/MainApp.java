package Strategy;

import Strategy.Group.PaymentByCreditCard;
import Strategy.Group.PaymentByPaypal;

public class MainApp {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();

        //Using the setter annotation from lombok
        ps.setPaymentInterface(new PaymentByCreditCard());
        ps.processOrder(100);

        System.out.println("***************************************");
        ps.setPaymentInterface(new PaymentByPaypal());
        ps.processOrder(100);

    }
}
