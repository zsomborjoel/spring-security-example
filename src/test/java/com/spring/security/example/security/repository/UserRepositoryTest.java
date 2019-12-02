package com.spring.security.example.security.repository;

import static org.junit.Assert.assertNotNull;

import com.spring.security.example.Application;
import com.spring.security.example.repository.UserRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserRepositoryTest {
    
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUserRepository() {
        assertNotNull(userRepository);
    }

    @Test
    public void testGetAllUser() {
        assertNotNull(userRepository.findAll());
        System.out.println(userRepository.findAll());
    }
}