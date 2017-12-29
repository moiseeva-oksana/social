package springboot.social.service;

import springboot.social.models.User;
import springboot.social.stubs.UsersMap;

public class UserService {
    public void addUser(String login, String password, String name, String lastName) {
        UsersMap.addUser(new User(login, password, name, lastName));
    }
}
