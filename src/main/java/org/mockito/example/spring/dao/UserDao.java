package org.mockito.example.spring.dao;

import org.mockito.example.spring.domain.User;

/**
 * @author Arthur Zagretdinov
 * @date 22/02/16.
 */
public interface UserDao {
    Integer create(User user);

    User findByName(String name);

}
