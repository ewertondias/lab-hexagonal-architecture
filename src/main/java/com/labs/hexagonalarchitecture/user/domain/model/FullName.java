package com.labs.hexagonalarchitecture.user.domain.model;

import com.labs.hexagonalarchitecture.user.domain.exception.FirstNameInvalidException;
import com.labs.hexagonalarchitecture.user.domain.exception.LastNameInvalidException;

public record FullName(String firstName, String lastName) {

    public FullName {
        if (firstName == null || firstName.isBlank()) {
            throw new FirstNameInvalidException();
        }

        if (lastName == null || lastName.isBlank()) {
            throw new LastNameInvalidException();
        }

        firstName = firstName.trim();
        lastName = lastName.trim();
    }

    public static FullName of(String firstName, String lastName) {
        return new FullName(firstName, lastName);
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

}
