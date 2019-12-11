package com.sathya.security.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entities.Role;
import com.sathya.security.entities.User;

public interface RoleRepository extends CrudRepository<Role, Integer> {

}
