package Singleton;

public class MySingleton {
    private final String data;

    private static MySingleton instance;
    private MySingleton(String data){
        this.data = data;
    }

    public static MySingleton getInstance(String data){
        if(instance == null){
            synchronized (MySingleton.class){
                if(instance == null){
                    instance = new MySingleton(data);
                }
            }
        }
        return instance;
    }

    public String getData(){
        return data;
    }
}
