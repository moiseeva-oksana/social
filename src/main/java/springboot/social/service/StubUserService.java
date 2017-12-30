package springboot.social.service;


import springboot.social.models.User;
import springboot.social.service.interfaces.SimpleUserService;
import springboot.social.stubs.UsersMap;

import java.util.Objects;

public class StubUserService implements SimpleUserService {

    private static User errorUser;

    static {
        errorUser = new User();
        errorUser.setId(-1);
    }

    @Override
    public void addUser(User user) {
        UsersMap.addUser(user);
    }

    @Override
    public User getByEmail(String email) {
        return UsersMap.users.values().
                stream().
                filter(t -> t.getLogin().equals(email)).
                findAny().
                orElse(errorUser);
    }

    @Override
    public User getByLoginAndPassword(String login, String password) {
        User user = getByEmail(login);
        if (Objects.equals(user.getPassword(), password)) {
            return user;
        } else return errorUser;
    }
}
