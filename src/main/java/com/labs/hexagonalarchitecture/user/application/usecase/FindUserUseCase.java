package com.labs.hexagonalarchitecture.user.application.usecase;

import com.labs.hexagonalarchitecture.user.application.dto.FindUserQuery;
import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;

public interface FindUserUseCase {

    UserResponse execute(FindUserQuery query);

}
