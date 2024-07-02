package DecoratorPattern.Decorators;

import DecoratorPattern.Components.INotifier;

public class WhatsappDecorator extends BaseNotifierDecorator {

    public WhatsappDecorator(INotifier wrapped){
        super(wrapped);
    }

    @Override
    public void send(String message){
        super.send(message);
        String phoneNumber= databaseService.getPhoneNbrFromUserName(getUsername());
        System.out.println("Sending "+ message + " on facebook to " + phoneNumber);
    }
}
