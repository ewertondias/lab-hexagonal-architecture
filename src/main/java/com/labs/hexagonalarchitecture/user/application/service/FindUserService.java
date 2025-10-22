package com.labs.hexagonalarchitecture.user.application.service;

import com.labs.hexagonalarchitecture.user.application.dto.FindUserQuery;
import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;
import com.labs.hexagonalarchitecture.user.application.usecase.FindUserUseCase;

public class FindUserService implements FindUserUseCase {

    @Override
    public UserResponse execute(FindUserQuery query) {
        return null;
    }

}
