package com.labs.hexagonalarchitecture.user.adapter.in.api.dto;

public record CreateUserRequest(
    String firstName,
    String lastName,
    String email,
    String phoneNumber,
    String cpf,
    UserAddressRequest addressRequest) {
}
