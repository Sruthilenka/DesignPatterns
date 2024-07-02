package Strategy;

import Strategy.Group.PaymentInterface;
import lombok.Setter;

@Setter
public class PaymentService {
    private int cost;
    private boolean includeDelivery = true;

    private PaymentInterface paymentInterface;

    private int getTotal(){
        return includeDelivery ? cost+10 : cost;
    }

    public void processOrder(int cost){
        this.cost = cost;
        paymentInterface.collectPaymentDetails();
        if(paymentInterface.validatePaymentDetails()){
            paymentInterface.pay(getTotal());
        }
    }

}
