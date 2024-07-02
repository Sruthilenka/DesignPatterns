package Factory;

import Factory.Group.Android;
import Factory.Group.IOS;
import Factory.Group.OS;
import Factory.Group.Windows;

public class OperatingSystemFactory {
    //this class is for passing the object to the Factory class
    // So in the future if u have to change anything then we need to make changes only in this class.
    public OS getInstance(String os_type){
        if(os_type.equalsIgnoreCase("Open")){
            return new Android();
        }else if(os_type.equalsIgnoreCase("Closed")){
            return new IOS();
        }else{
            return new Windows();
        }
    }
}
