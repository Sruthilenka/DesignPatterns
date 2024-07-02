package Factory;

import Factory.Group.OS;

public class FactoryMain {
    public static void main(String[] args) {
        //This class is for creating object of required class
        OperatingSystemFactory osf = new OperatingSystemFactory();
      OS obj =  osf.getInstance("Open"); // SHould return OS type
        obj.spec(); // calls respective object classes's method
    }
}
