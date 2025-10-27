package com.labs.hexagonalarchitecture.user.application.dto;

public record CreateUserCommand(
    String firstName,
    String lastName,
    String email,
    String phoneNumber,
    String cpf,
    UserAddressCommand addressCommand) {
}