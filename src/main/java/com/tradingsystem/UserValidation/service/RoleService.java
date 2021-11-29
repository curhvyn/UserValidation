package com.tradingsystem.UserValidation.service;

import com.tradingsystem.UserValidation.entity.RoleEntity;

import java.util.List;

public interface RoleService {

    public RoleEntity createRole(RoleEntity roleEntity);
    public List<RoleEntity> getALlRoles();
    public RoleEntity getRoleById(Long roleId);
}
