package com.spring.security.example.security.repository;

import static org.junit.Assert.assertNotNull;

import com.spring.security.example.Application;
import com.spring.security.example.repository.RoleRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RoleRepositoryTest {
    
    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testRoleRepository() {
        assertNotNull(roleRepository);
    }

    @Test
    public void testGetAllRole() {
        assertNotNull(roleRepository.findAll());
    }
}