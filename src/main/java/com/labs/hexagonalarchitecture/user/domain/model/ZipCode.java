package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.ZipCodeInvalidException;

public record ZipCode(String value) {

    public ZipCode {
        if (value == null || value.isEmpty()) {
            throw new ZipCodeInvalidException();
        }

        validate(value);

        value = value.replaceAll("\\D", "");
    }

    private void validate(String value) {
        if (!value.matches("\\d{5}-\\d{3}")) {
            throw new ZipCodeInvalidException();
        }
    }

}
