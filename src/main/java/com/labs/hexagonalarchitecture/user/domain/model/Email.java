package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.EmailInvalidException;

public record Email(String value) {

    public Email {
        if (value == null || value.isBlank()) {
            throw new EmailInvalidException();
        }

        validate(value);

        value = value.toLowerCase();
    }

    public static Email of(String value) {
        return new Email(value);
    }

    private void validate(String value) {
        if (!value.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new EmailInvalidException();
        }
    }

}
