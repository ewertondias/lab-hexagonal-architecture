package com.labs.hexagonalarchitecture.user.application.dto;

public record UserAddressCommand(
    String street,
    String number,
    String city,
    String state,
    String zipCode) {
}
