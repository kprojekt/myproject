package com.sathya.security.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entities.Permission;

public interface PermissionRepository extends CrudRepository<Permission, Integer> {

}
