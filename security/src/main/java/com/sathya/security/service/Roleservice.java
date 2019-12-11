package com.sathya.security.service;

import com.sathya.security.entities.Role;

public interface Roleservice {
	

	public Iterable<Role> getAllRoles();
	// TODO Auto-generated method stub

	public Role insertData(Role role);

	public Role updateRole(Role role);

	public void deleteFromRole(Integer id);

	public Object getById(Integer id);

	public Role insertNewRole(Role role);

}
