package com.labs.hexagonalarchitecture.user.application.assembler;

import com.labs.hexagonalarchitecture.user.application.dto.CreateUserCommand;
import com.labs.hexagonalarchitecture.user.application.dto.UserAddressResponse;
import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;
import com.labs.hexagonalarchitecture.user.domain.model.Address;
import com.labs.hexagonalarchitecture.user.domain.model.AddressCity;
import com.labs.hexagonalarchitecture.user.domain.model.AddressNumber;
import com.labs.hexagonalarchitecture.user.domain.model.AddressState;
import com.labs.hexagonalarchitecture.user.domain.model.AddressStreet;
import com.labs.hexagonalarchitecture.user.domain.model.CPF;
import com.labs.hexagonalarchitecture.user.domain.model.ContactInfo;
import com.labs.hexagonalarchitecture.user.domain.model.Email;
import com.labs.hexagonalarchitecture.user.domain.model.FullName;
import com.labs.hexagonalarchitecture.user.domain.model.PhoneNumber;
import com.labs.hexagonalarchitecture.user.domain.model.User;
import com.labs.hexagonalarchitecture.user.domain.model.UserId;
import com.labs.hexagonalarchitecture.user.domain.model.ZipCode;

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
            toUserAddressResponse(user),
            user.getStatus().name()
        );
    }

    public static User toDomain(CreateUserCommand command) {
        var fullName = FullName.of(command.firstName(), command.lastName());
        var contactInfo = new ContactInfo(Email.of(command.email()), PhoneNumber.of(command.phoneNumber()));
        var cpf = CPF.of(command.cpf());
        var address = new Address(
            new AddressStreet(command.addressCommand().street()),
            new AddressNumber(command.addressCommand().number()),
            new AddressCity(command.addressCommand().city()),
            new AddressState(command.addressCommand().state()),
            ZipCode.of(command.addressCommand().zipCode())
        );

        return User.create(UserId.generate(), fullName, contactInfo, cpf, address);
    }

    private static UserAddressResponse toUserAddressResponse(User user) {
        return new UserAddressResponse(
            user.getUserStreet().value(),
            user.getUserNumber().value(),
            user.getUserCity().value(),
            user.getUserState().value(),
            user.getUserZipCode().value()
        );
    }

}
