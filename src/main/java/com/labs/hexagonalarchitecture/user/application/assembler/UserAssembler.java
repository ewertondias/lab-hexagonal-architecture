package com.labs.hexagonalarchitecture.user.application.assembler;

import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;
import com.labs.hexagonalarchitecture.user.domain.model.User;

public final class UserAssembler {

    private UserAssembler() {
    }

    public static UserResponse toResponse(User user) {
        return new UserResponse(
            user.getId().toString(),
            user.getName().firstName(),
            user.getName().lastName(),
            user.getUserEmail().value(),
            user.getCpf().value(),
            user.getStatus().name()
        );
    }

}
