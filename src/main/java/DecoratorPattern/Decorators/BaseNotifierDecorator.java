package DecoratorPattern.Decorators;

import DecoratorPattern.DatabaseService;
import DecoratorPattern.Components.INotifier;

public class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapped;
    protected final DatabaseService databaseService;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
