package com.labs.hexagonalarchitecture.user.adapter.out.persistence;

import com.labs.hexagonalarchitecture.user.adapter.out.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepositoryJpa extends JpaRepository<UserEntity, UUID> {
}
