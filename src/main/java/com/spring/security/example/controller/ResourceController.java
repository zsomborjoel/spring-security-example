package com.spring.security.example.controller;

import com.spring.security.example.service.CreditCardService;
import com.spring.security.example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.example.model.CreditCard;
import com.spring.security.example.model.User;
import java.util.List;

@RestController
@RequestMapping("/security/v1")
public class ResourceController {

    @Autowired
    private CreditCardService creditCardService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/cards", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<CreditCard> getAllCards() {
        return creditCardService.getAllCards();
    }

} 
