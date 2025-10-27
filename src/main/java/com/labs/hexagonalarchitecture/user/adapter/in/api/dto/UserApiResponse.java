package com.labs.hexagonalarchitecture.user.adapter.in.api.dto;

public record UserApiResponse(
    String id,
    String firstName,
    String lastName,
    String email,
    String phoneNumber,
    String cpf,
    UserAddressApiResponse address,
    String status) {
}
