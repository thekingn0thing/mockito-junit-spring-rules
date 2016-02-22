package org.mockito.example.spring.domain;

/**
 * @author Arthur Zagretdinov
 * @date 22/02/16.
 */
public class User {
    private String name;
    private final String login;

    public User(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public String getName() {
        return name;
    }
}
