package com.labs.hexagonalarchitecture.user.domain.model;

public record Address(
    AddressStreet street,
    AddressNumber number,
    AddressCity city,
    AddressState state,
    ZipCode zipCode) {
}
