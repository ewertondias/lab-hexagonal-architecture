package com.labs.hexagonalarchitecture.user.application.service;

import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;
import com.labs.hexagonalarchitecture.user.application.usecase.FindUserUseCase;
import com.labs.hexagonalarchitecture.user.domain.model.UserId;

public class FindUserService implements FindUserUseCase {

    @Override
    public UserResponse execute(UserId id) {
        return null;
    }

}
