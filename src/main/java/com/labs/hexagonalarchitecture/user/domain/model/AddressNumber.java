package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.AddressNumberInvalidException;

public record AddressNumber(String value) {

    public AddressNumber {
        if (value == null || value.isEmpty()) {
            throw new AddressNumberInvalidException();
        }
    }

}
