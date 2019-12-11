package com.sathya.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.security.data.PermissionRepository;
import com.sathya.security.entities.Permission;

@Service
public class PermissionserviceImpl implements Permissionservice {
	@Autowired 
	PermissionRepository permissionRepository;

	@Override
	public Iterable<Permission> getAllPermissions() {
		// TODO Auto-generated method stub
		return permissionRepository.findAll();
	}

	@Transactional
	public Permission insertData(Permission permission) {
		// TODO Auto-generated method stub
		return permissionRepository.save(permission);
	}

	@Transactional
	public Permission updatePermission(Permission permission) {
		// TODO Auto-generated method stub
		return permissionRepository.save(permission);
	}

	@Transactional
	public void deleteFromPermission(Integer id) {
		permissionRepository.deleteById(id);

	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permission insertNewPermission(Permission permission) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
