package DecoratorPattern;

import DecoratorPattern.Components.INotifier;
import DecoratorPattern.Components.Notifier;
import DecoratorPattern.Decorators.FacebookDecorator;
import DecoratorPattern.Decorators.WhatsappDecorator;

public class MainApp {
    public static void main(String[] args) {
        //will be sent to FB, Whatsap, email
        INotifier notifyAll = new FacebookDecorator(new WhatsappDecorator(new Notifier("Geekific")));
        notifyAll.send("Like And Subscribe");

        System.out.println("***********************");

        //Sent to facebook and Email
        INotifier notifyMail = new FacebookDecorator(new Notifier("Geekific"));
        notifyMail.send("like");
    }
}
