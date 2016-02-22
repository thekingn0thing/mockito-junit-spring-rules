package org.mockito.example.spring;

import org.mockito.example.spring.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Mockito.mock;

/**
 * @author Arthur Zagretdinov
 * @date 22/02/16.
 */
@Configuration
@ComponentScan({"org.mockito.example.spring.service"})
public class SpringMockTestConfig {

    @Bean
    public UserDao userDao() {
        return mock(UserDao.class);
    }


}
