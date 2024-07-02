package Singleton;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(MySingleton.getInstance("Geekific"));
        //Creating second instance
        MySingleton singleton = MySingleton.getInstance("Singleton"); //points to the earlier instance itself
        System.out.println(singleton);

        System.out.println(singleton.getData()); // as new instance is never cfeated returns first data
    }
}
