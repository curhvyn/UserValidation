package com.tradingsystem.UserValidation.service;

import com.tradingsystem.UserValidation.model.RoleModel;

import java.util.List;

public interface RoleService {

    RoleModel createRole(RoleModel roleModel);
    List<RoleModel> getAllRoles();
    RoleModel getRoleById(Long roleId);
    void deleteRoleById(Long roleId);
}