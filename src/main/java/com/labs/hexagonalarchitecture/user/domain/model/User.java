package com.labs.hexagonalarchitecture.user.domain.model;

import java.util.Objects;

public class User {

    private final UserId id;
    private FullName name;
    private Email email;
    private final CPF cpf;
    private UserStatusEnum status;

    private User(UserId id, FullName name, Email email, CPF cpf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.status = UserStatusEnum.ACTIVE;
    }

    public static User of(UserId id, FullName name, Email email, CPF cpf) {
        return new User(id, name, email, cpf);
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
            ", email=" + email +
            ", cpf=" + cpf +
            ", status=" + status +
            '}';
    }

}
