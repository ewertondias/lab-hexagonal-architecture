package com.labs.hexagonalarchitecture.user.application.assembler;

import com.labs.hexagonalarchitecture.user.application.dto.UserAddressResponse;
import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;
import com.labs.hexagonalarchitecture.user.domain.model.Address;
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
            user.getUserPhoneNumber().value(),
            user.getCpf().value(),
            toUserAddressResponse(user.getAddress()),
            user.getStatus().name()
        );
    }

    private static UserAddressResponse toUserAddressResponse(Address address) {
        return new UserAddressResponse(
            address.street().value(),
            address.number().value(),
            address.city().value(),
            address.state().value(),
            address.zipCode().value()
        );
    }

}
