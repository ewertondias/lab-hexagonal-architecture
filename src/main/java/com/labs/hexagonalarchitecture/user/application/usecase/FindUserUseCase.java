package com.labs.hexagonalarchitecture.user.application.usecase;

import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;
import com.labs.hexagonalarchitecture.user.domain.model.UserId;

public interface FindUserUseCase {

    UserResponse execute(UserId id);

}
