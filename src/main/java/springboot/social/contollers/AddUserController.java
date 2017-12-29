package springboot.social.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springboot.social.service.UserService;
import springboot.social.stubs.UsersMap;

@Controller
public class AddUserController {
    private UserService userService = new UserService();
    @RequestMapping( path = "/add", method = RequestMethod.POST)
    public String addUser(@RequestParam String login, @RequestParam String password, @RequestParam String name, @RequestParam String lastName) {
        userService.addUser(login, password, name, lastName);
        System.out.println(UsersMap.users);
        return "added";
    }
}
