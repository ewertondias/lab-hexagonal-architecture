package com.labs.hexagonalarchitecture.user.application.dto;

public record UserAddressResponse(
    String street,
    String number,
    String city,
    String state,
    String zipCode) {
}
