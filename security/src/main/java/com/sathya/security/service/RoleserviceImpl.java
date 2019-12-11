package com.sathya.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.security.data.RoleRepository;
import com.sathya.security.entities.Role;

@Service
public class RoleserviceImpl implements Roleservice {
	@Autowired 
	RoleRepository roleRepository;

	@Override
	public Iterable<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Transactional
	public Role insertData(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Transactional
	public Role updateRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Transactional
	public void deleteFromRole(Integer id) {
		roleRepository.deleteById(id);

	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role insertNewRole(Role Role) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
