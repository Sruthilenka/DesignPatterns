package DecoratorPattern;

public class DatabaseService {

    public String getMailFromUserName(String username){
        return username + "@Mail";
    }

    public String getPhoneNbrFromUserName(String username){
        return username + "@Phone";
    }

    public String getFBNameFromUserName(String username){
        return username + "@Facebook";
    }
}
