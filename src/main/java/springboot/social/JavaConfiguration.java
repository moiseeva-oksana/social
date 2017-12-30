package springboot.social;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.social.service.StubUserService;
import springboot.social.service.interfaces.SimpleUserService;

@Configuration
public class JavaConfiguration {
    @Bean
    public SimpleUserService stubUserService() {
        return new StubUserService();
    }
}
