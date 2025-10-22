package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.AddressCityInvalidException;

public record AddressCity(String value) {

    public AddressCity {
        if (value == null || value.isEmpty()) {
            throw new AddressCityInvalidException();
        }
    }

}
