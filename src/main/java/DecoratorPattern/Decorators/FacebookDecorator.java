package DecoratorPattern.Decorators;

import DecoratorPattern.Components.INotifier;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String message){
        super.send(message);
        String fbName= databaseService.getFBNameFromUserName(getUsername());
        System.out.println("Sending "+ message + " on facebook to " + fbName);
    }
}
