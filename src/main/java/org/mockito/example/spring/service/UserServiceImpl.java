package org.mockito.example.spring.service;

import org.mockito.example.spring.dao.UserDao;
import org.mockito.example.spring.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Arthur Zagretdinov
 * @date 22/02/16.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        User existingUser = userDao.findByName( user.getName());
        if (existingUser != null) {
            throw new RuntimeException();
        }

        return userDao.create(user);
    }
}
