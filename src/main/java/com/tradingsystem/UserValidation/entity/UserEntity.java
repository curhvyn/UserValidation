package com.tradingsystem.UserValidation.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "USER_TABLE")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    @Column(name = "USER_NAME", nullable = false)
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    @JsonManagedReference //helps avoid circular dependency in bi-directional mapping
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = { @JoinColumn(name = "user_id")},
            inverseJoinColumns = { @JoinColumn(name = "role_id")})
    private Set<RoleEntity> roles = new HashSet<>();

    public Long getId(){
        return id;
    }


}
