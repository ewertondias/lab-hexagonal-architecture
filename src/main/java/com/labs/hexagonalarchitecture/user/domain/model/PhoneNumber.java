package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.PhoneInvalidException;

public record PhoneNumber(String value) {

    public PhoneNumber {
        if (value == null || value.isBlank()) {
            throw new PhoneInvalidException();
        }

        validate(value);

        value = value.replaceAll("\\D", "");
    }

    public static PhoneNumber of(String value) {
        return new PhoneNumber(value);
    }

    private void validate(String value) {
        if (value.length() != 9) {
            throw new PhoneInvalidException();
        }
    }

}
