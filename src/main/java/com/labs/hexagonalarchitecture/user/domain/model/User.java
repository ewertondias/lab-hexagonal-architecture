package com.labs.hexagonalarchitecture.user.domain.model;

import java.util.Objects;

public class User {

    private final UserId id;
    private FullName name;
    private ContactInfo contactInfo;
    private final CPF cpf;
    private Address address;
    private UserStatusEnum status;

    private User(UserId id, FullName name, ContactInfo contactInfo, CPF cpf, Address address) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.cpf = cpf;
        this.address = address;
        this.status = UserStatusEnum.ACTIVE;
    }

    public static User create(UserId id, FullName name, ContactInfo contactInfo, CPF cpf, Address address) {
        return new User(id, name, contactInfo, cpf, address);
    }

    public UserId getId() {
        return id;
    }

    public FullName getName() {
        return name;
    }

    public Email getUserEmail() {
        return contactInfo.email();
    }

    public CPF getCpf() {
        return cpf;
    }

    public Address getAddress() {
        return address;
    }

    public UserStatusEnum getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", name=" + name +
            ", contactInfo=" + contactInfo +
            ", cpf=" + cpf +
            ", address=" + address +
            ", status=" + status +
            '}';
    }

}
