package com.labs.hexagonalarchitecture.user.adapter.out.persistence.entity;

import java.util.UUID;

public class UserEntityBuilder {

    protected UUID id;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String cpf;
    protected String street;
    protected String number;
    protected String city;
    protected String state;
    protected String zipCode;
    protected String status;

    public UserEntityBuilder id(UUID id) {
        this.id = id;
        return this;
    }

    public UserEntityBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserEntityBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserEntityBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserEntityBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserEntityBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public UserEntityBuilder street(String street) {
        this.street = street;
        return this;
    }
    
    public UserEntityBuilder number(String number) {
        this.number = number;
        return this;
    }

    public UserEntityBuilder city(String city) {
        this.city = city;
        return this;
    }

    public UserEntityBuilder state(String state) {
        this.state = state;
        return this;
    }

    public UserEntityBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public UserEntityBuilder status(String status) {
        this.status = status;
        return this;
    }

    public UserEntity build() {
        return new UserEntity(this);
    }
    
}
