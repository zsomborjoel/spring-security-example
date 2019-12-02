package com.spring.security.example.security.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spring.security.example.Application;
import com.spring.security.example.repository.UserRepository;
import com.spring.security.example.service.AppUserDetailsService;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AppUserDetailsServiceTest {
    
    @Autowired
    private AppUserDetailsService appUserDetails;

    @Test 
    public void testUserDetailsServiceNotNull() throws Exception {
        assertNotNull(appUserDetails);
    }
    
    @Test
    public void testUserDetailsService() throws Exception {
        assertNotNull(appUserDetails.loadUserByUsername("admin.admin"));
    }

    @Test
    public void testUserDetailsService2() throws Exception {
        assertNotNull(appUserDetails.loadUserByUsername("zsombor.gyurkovics"));
    }

  
}