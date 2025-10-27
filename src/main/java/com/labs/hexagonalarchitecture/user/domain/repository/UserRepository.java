package com.labs.hexagonalarchitecture.user.domain.repository;

import com.labs.hexagonalarchitecture.user.domain.model.User;
import com.labs.hexagonalarchitecture.user.domain.model.UserId;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User save(User user);
    Optional<User> findById(UserId id);
    List<User> findAll();

}
