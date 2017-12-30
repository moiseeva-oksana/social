package springboot.social.models;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class User {
    private int id = 0;
    public String login;
    private String password;
    private String name;
    private String lastName;
    private LocalDate dob = null;


    public User(String login, String password, String name, String lastName) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
    }

}
