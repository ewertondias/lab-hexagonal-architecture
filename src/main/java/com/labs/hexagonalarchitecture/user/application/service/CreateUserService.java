package com.labs.hexagonalarchitecture.user.application.service;

import com.labs.hexagonalarchitecture.user.application.assembler.UserAssembler;
import com.labs.hexagonalarchitecture.user.application.dto.CreateUserCommand;
import com.labs.hexagonalarchitecture.user.application.dto.UserResponse;
import com.labs.hexagonalarchitecture.user.application.usecase.CreateUserUseCase;
import com.labs.hexagonalarchitecture.user.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService implements CreateUserUseCase {

    private final UserRepository repository;

    public CreateUserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserResponse execute(CreateUserCommand command) {
        var user = UserAssembler.toDomain(command);

        var userCreated = repository.save(user);

        return UserAssembler.toResponse(userCreated);
    }

}
