package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.AddressNumberInvalidException;

public record AddressNumber(String number) {

    public AddressNumber {
        if (number == null || number.isEmpty()) {
            throw new AddressNumberInvalidException();
        }
    }

}
