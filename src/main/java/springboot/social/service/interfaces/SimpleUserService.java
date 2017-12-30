package springboot.social.service.interfaces;

import springboot.social.models.User;

public interface SimpleUserService {
    void addUser(User user);
    User getByEmail(String email);
    User getByLoginAndPassword(String login, String password);
}
