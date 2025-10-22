package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.AddressStreetInvalidException;

import java.util.Arrays;

public record AddressState(String value) {

    public AddressState {
        if (value == null || value.isEmpty()) {
            throw new AddressStreetInvalidException();
        }

        validate(value);
    }

    private void validate(String value) {
        Arrays.stream(AddressStateEnum.values())
            .filter(state -> state.getAcronym().equals(value))
            .findFirst()
            .orElseThrow(AddressStreetInvalidException::new);
    }

}
