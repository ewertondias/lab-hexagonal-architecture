package com.labs.hexagonalarchitecture.user.adapter.in.api.assembler;

import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.CreateUserRequest;
import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.UserAddressApiResponse;
import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.UserAddressRequest;
import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.UserApiResponse;
import com.labs.hexagonalarchitecture.user.application.dto.CreateUserCommand;
import com.labs.hexagonalarchitecture.user.application.dto.UserAddressCommand;
import com.labs.hexagonalarchitecture.user.application.dto.UserAddressResponse;
import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;

public final class UserApiAssembler {

    private UserApiAssembler() {
    }

    public static CreateUserCommand toCommand(CreateUserRequest request) {
        return new CreateUserCommand(
            request.firstName(),
            request.lastName(),
            request.email(),
            request.phoneNumber(),
            request.cpf(),
            toUserAddressCommand(request.addressRequest())
        );
    }

    public static UserApiResponse toApiResponse(UserResponse userResponse) {
        return new UserApiResponse(
            userResponse.id(),
            userResponse.firstName(),
            userResponse.lastName(),
            userResponse.email(),
            userResponse.phoneNumber(),
            userResponse.cpf(),
            toUserAddressApiResponse(userResponse.address()),
            userResponse.status()
        );
    }

    private static UserAddressCommand toUserAddressCommand(UserAddressRequest userAddressRequest) {
        return new UserAddressCommand(
            userAddressRequest.street(),
            userAddressRequest.number(),
            userAddressRequest.city(),
            userAddressRequest.state(),
            userAddressRequest.zipCode()
        );
    }

    private static UserAddressApiResponse toUserAddressApiResponse(UserAddressResponse userAddressResponse) {
        return new UserAddressApiResponse(
            userAddressResponse.street(),
            userAddressResponse.number(),
            userAddressResponse.city(),
            userAddressResponse.state(),
            userAddressResponse.zipCode()
        );
    }

}
