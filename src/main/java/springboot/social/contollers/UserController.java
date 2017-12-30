package springboot.social.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springboot.social.models.User;
import springboot.social.service.interfaces.SimpleUserService;
import springboot.social.stubs.UsersMap;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private SimpleUserService userService;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String addUser(@RequestParam String login, @RequestParam String password, @RequestParam String name, @RequestParam String lastName, HttpSession session) {
        User user = new User(login, password, name, lastName);
        session.setAttribute("user", user);
        userService.addUser(user);
        System.out.println(UsersMap.users);
        return "myPage";
    }

    @RequestMapping(path = "/signin", method = RequestMethod.POST)
    public String signIn(@RequestParam String login, @RequestParam String password, HttpSession session) {
        session.removeAttribute("user");
        User user = userService.getByLoginAndPassword(login, password);
        if (user.getId() != -1) {
            session.setAttribute("user", user);
            return "myPage";
        } else return "login";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }


}
