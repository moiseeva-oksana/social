package springboot.social.stubs;

import springboot.social.models.User;

import java.util.HashMap;
import java.util.Map;

public class UsersMap {
    public static Map<Integer, User> users = new HashMap<>();
    private static int count;

    public static void addUser(User user) {
        users.put(++count, user);
    }
}
