package com.labs.hexagonalarchitecture.user.application.dto;

public record UserResponse(
    String id,
    String firstName,
    String lastName,
    String email,
    String cpf,
    String status) {
}
