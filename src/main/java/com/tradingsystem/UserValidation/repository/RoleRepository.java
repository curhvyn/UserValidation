package com.tradingsystem.UserValidation.repository;

import com.tradingsystem.UserValidation.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
