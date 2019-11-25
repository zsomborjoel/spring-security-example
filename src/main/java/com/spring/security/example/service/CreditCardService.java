package com.spring.security.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.spring.security.example.model.CreditCard;
import com.spring.security.example.repository.CreditCardRepository;

@Service
public class CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    public Optional<CreditCard> getCardById(Long id) {
        return creditCardRepository.findById(id);
    }

    public List<CreditCard> getAllCards() {
        return creditCardRepository.findAll();
    }

}