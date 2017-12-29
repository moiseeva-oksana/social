package springboot.social.models;


import lombok.Value;

import java.time.LocalDate;

@Value
public class User {
    private int id = 0;
    private String login;
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
