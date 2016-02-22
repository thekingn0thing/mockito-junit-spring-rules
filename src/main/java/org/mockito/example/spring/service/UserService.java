package org.mockito.example.spring.service;

import org.mockito.example.spring.domain.User;

/**
 * @author Arthur Zagretdinov
 * @date 22/02/16.
 */
public interface UserService {
    int addUser(User user);
}
