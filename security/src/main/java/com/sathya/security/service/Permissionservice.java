package com.sathya.security.service;

import com.sathya.security.entities.Permission;

public interface Permissionservice {
	

	public Iterable<Permission> getAllPermissions();
	// TODO Auto-generated method stub

	public Permission insertData(Permission Permission);

	public Permission updatePermission(Permission permission);

	public void deleteFromPermission(Integer id);

	public Object getById(Integer id);

	public Permission insertNewPermission(Permission permission);

}
