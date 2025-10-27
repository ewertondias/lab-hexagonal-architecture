package com.labs.hexagonalarchitecture.user.adapter.out.persistence.assembler;

import com.labs.hexagonalarchitecture.user.adapter.out.persistence.entity.UserEntity;
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

public final class UserPersistenceAssembler {

    private UserPersistenceAssembler() {
    }

    public static UserEntity toEntity(User user) {
        return new UserEntity(

        );
    }

    public static User toDomain(UserEntity entity) {
        var userId = new UserId(entity.getId());
        var fullName = FullName.of(entity.getFirstName(), entity.getLastName());
        var contactInfo = new ContactInfo(Email.of(entity.getEmail()), PhoneNumber.of(entity.getPhoneNumber()));
        var cpf = CPF.of(entity.getCpf());
        var address = new Address(
            new AddressStreet(entity.getStreet()),
            new AddressNumber(entity.getNumber()),
            new AddressCity(entity.getCity()),
            new AddressState(entity.getState()),
            ZipCode.of(entity.getZipCode())
        );

        return User.create(
            userId,
            fullName,
            contactInfo,
            cpf,
            address
        );
    }

}
