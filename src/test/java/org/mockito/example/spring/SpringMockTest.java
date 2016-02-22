package org.mockito.example.spring;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.example.spring.domain.User;
import org.mockito.example.spring.dao.UserDao;
import org.mockito.example.spring.service.UserService;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

/**
 * @author Arthur Zagretdinov
 * @date 22/02/16.
 */
@ContextConfiguration(classes = {SpringMockTestConfig.class})
@RunWith(MockitoJUnitRunner.class)
public class SpringMockTest {


    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();


    @Resource
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @Test
    public void testMockito() {
        when(userDao.findByName("bla")).thenReturn(null);
        when(userDao.create(any(User.class))).thenReturn(1);


        int id = userService.addUser(new User("bla", "bla"));
        assertEquals(1, id);

        reset(userDao);


    }


}
