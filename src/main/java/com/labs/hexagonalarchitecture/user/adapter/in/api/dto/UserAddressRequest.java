package com.labs.hexagonalarchitecture.user.adapter.in.api.dto;

public record UserAddressRequest(
    String street,
    String number,
    String city,
    String state,
    String zipCode) {
}
