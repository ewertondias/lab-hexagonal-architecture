package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.UserIdInvalidException;

import java.util.UUID;

public record UserId(UUID value) {

    public UserId {
        if (value == null) {
            throw new UserIdInvalidException();
        }
    }

    public static UserId generate() {
        return new UserId(UUID.randomUUID());
    }

    public static UserId fromString(String value) {
        try {
            return new UserId(UUID.fromString(value));
        } catch (IllegalArgumentException e) {
            throw new UserIdInvalidException();
        }
    }

}
