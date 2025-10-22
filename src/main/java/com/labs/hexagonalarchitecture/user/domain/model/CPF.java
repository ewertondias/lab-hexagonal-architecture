package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.CPFInvalidException;

public record CPF(String value) {

    public CPF {
        if (value == null || value.isBlank()) {
            throw new CPFInvalidException();
        }

        var cleaned = value.replaceAll("\\D", "");

        validate(cleaned);

        value = cleaned;
    }

    public static CPF of(String value) {
        return new CPF(value);
    }

    private void validate(String cleaned) {
        if (cleaned.length() != 11) {
            throw new CPFInvalidException();
        }
    }

    public String formatted() {
        return String.format(
            "%s.%s.%s-%s",
            value.substring(0, 3),
            value.substring(3, 6),
            value.substring(6, 9),
            value.substring(9, 11)
        );
    }

}
