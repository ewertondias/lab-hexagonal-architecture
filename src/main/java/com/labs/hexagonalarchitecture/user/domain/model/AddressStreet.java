package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.AddressStreetInvalidException;

public record AddressStreet(String value) {

    public AddressStreet {
        if (value == null || value.isEmpty()) {
            throw new AddressStreetInvalidException();
        }
    }

}
