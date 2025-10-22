package com.labs.hexagonalarchitecture.user.application.service;

import com.labs.hexagonalarchitecture.user.application.dto.CreateUserCommand;
import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;
import com.labs.hexagonalarchitecture.user.application.usecase.CreateUserUseCase;

public class CreateUserService implements CreateUserUseCase {

    @Override
    public UserResponse execute(CreateUserCommand command) {
        return null;
    }

}
