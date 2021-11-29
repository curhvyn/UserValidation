package com.tradingsystem.UserValidation.service;

import com.tradingsystem.UserValidation.entity.RoleEntity;
import com.tradingsystem.UserValidation.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{


    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleEntity createRole(RoleEntity roleEntity) {
        return roleRepository.save(roleEntity);
    }

    @Override
    public List<RoleEntity> getALlRoles() {
        return roleRepository.findAll();
    }

    @Override
    public RoleEntity getRoleById(Long roleId) {
        return roleRepository.findById(roleId).get();
    }
}
