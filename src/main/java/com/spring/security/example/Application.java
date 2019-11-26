package com.spring.security.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.security.example.model.CreditCard")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
