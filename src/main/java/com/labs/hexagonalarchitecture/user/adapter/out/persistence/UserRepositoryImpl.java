package com.labs.hexagonalarchitecture.user.adapter.out.persistence;

import com.labs.hexagonalarchitecture.user.adapter.out.persistence.assembler.UserPersistenceAssembler;
import com.labs.hexagonalarchitecture.user.domain.model.User;
import com.labs.hexagonalarchitecture.user.domain.model.UserId;
import com.labs.hexagonalarchitecture.user.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserRepositoryJpa jpaRepository;

    public UserRepositoryImpl(UserRepositoryJpa jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public User save(User user) {
        var entity = UserPersistenceAssembler.toEntity(user);

        var savedEntity = jpaRepository.save(entity);

        return UserPersistenceAssembler.toDomain(savedEntity);
    }

    @Override
    public Optional<User> findById(UserId id) {
        return jpaRepository.findById(id.value())
            .map(UserPersistenceAssembler::toDomain);
    }

    @Override
    public List<User> findAll() {
        return jpaRepository.findAll()
            .stream()
            .map(UserPersistenceAssembler::toDomain)
            .toList();
    }

}
