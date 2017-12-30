package springboot.social;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.social.models.User;
import springboot.social.service.StubUserService;
import springboot.social.service.interfaces.SimpleUserService;

@Configuration
public class JavaConfiguration {
    @Bean
    public SimpleUserService stubUserService() {
        return new StubUserService();
    }

    @Bean
    public User errorUser() {
        User errorUser = new User();
        errorUser.setId(-1);
        return errorUser;
    }
}
