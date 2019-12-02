package com.spring.security.example.security.repository;

import static org.junit.Assert.assertNotNull;

import com.spring.security.example.Application;
import com.spring.security.example.repository.CreditCardRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CreditCardRepositoryTest {
    
    @Autowired
    private CreditCardRepository creditCardRepository;

    @Test
    public void testCreditCardRepository() {
        assertNotNull(creditCardRepository);
    }

    @Test
    public void testGetAllCreditCard() {
        assertNotNull(creditCardRepository.findAll());
    }
}