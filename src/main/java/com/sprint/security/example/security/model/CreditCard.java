package com.sprint.security.example.security.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card", schema = "spring_security")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="name")
    private String number;

    @Column(name="cvv")
    private String cvv;

    @Column(name="expiration_date")
    private String expirationDate;

    @Column(name="balance")
    private Long balance;

    public CreditCard() {
    }

    public CreditCard(Long id, String name, String number, String cvv, String expirationDate, Long balance) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.balance = balance;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return this.cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Long getBalance() {
        return this.balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public CreditCard id(Long id) {
        this.id = id;
        return this;
    }

    public CreditCard name(String name) {
        this.name = name;
        return this;
    }

    public CreditCard number(String number) {
        this.number = number;
        return this;
    }

    public CreditCard cvv(String cvv) {
        this.cvv = cvv;
        return this;
    }

    public CreditCard expirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public CreditCard balance(Long balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CreditCard)) {
            return false;
        }
        CreditCard creditCard = (CreditCard) o;
        return Objects.equals(id, creditCard.id) && Objects.equals(name, creditCard.name) && Objects.equals(number, creditCard.number) && Objects.equals(cvv, creditCard.cvv) && Objects.equals(expirationDate, creditCard.expirationDate) && Objects.equals(balance, creditCard.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, number, cvv, expirationDate, balance);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", number='" + getNumber() + "'" +
            ", cvv='" + getCvv() + "'" +
            ", expirationDate='" + getExpirationDate() + "'" +
            ", balance='" + getBalance() + "'" +
            "}";
    }

}