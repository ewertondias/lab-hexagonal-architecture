package com.labs.hexagonalarchitecture.user.application.usecase;

import com.labs.hexagonalarchitecture.user.application.dto.CreateUserCommand;
import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;

public interface CreateUserUseCase {

    UserResponse execute(CreateUserCommand command);

}
