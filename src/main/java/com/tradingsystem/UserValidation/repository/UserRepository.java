package com.tradingsystem.UserValidation.repository;

import com.tradingsystem.UserValidation.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
