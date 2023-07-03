import java.util.HashMap;
import java.util.Map;

public class UsersMap { //Map to contain users with password
    private static Map<String, String> userInfo = new HashMap<>();

    public static void addUser(String username, String password) {
        userInfo.put(username, password);
    }

    public static boolean AuthorizeUser(String username, String password) {
        if (userInfo.containsKey(username)) {
            String storedPassword = userInfo.get(username);
            if(password.equals(storedPassword)) {
                return true;
            }
        }
        return false;
    }

}