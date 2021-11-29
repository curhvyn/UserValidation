package com.tradingsystem.UserValidation.controller;

import com.tradingsystem.UserValidation.entity.RoleEntity;
import com.tradingsystem.UserValidation.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/roles")
    public RoleEntity createRole( @RequestBody RoleEntity roleEntity){
        return roleService.createRole(roleEntity);
    }

    @GetMapping("/roles")
    public List<RoleEntity> getAllRoles(){
        return roleService.getALlRoles();
    }
}
