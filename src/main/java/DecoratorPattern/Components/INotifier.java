package DecoratorPattern.Components;

public interface INotifier {
    void send(String message);
    String getUsername();
}
