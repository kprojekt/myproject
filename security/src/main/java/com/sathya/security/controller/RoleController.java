package com.sathya.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entities.Role;
import com.sathya.security.service.Roleservice;


@RestController
@RequestMapping(path="/role")
public class RoleController {
	@Autowired 
	private Roleservice roleservice;

	@GetMapping(path="/getAllRoles")
	public Iterable<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return roleservice.getAllRoles();
	}

	@PostMapping(path="/addRole")
	public Role insertData(@RequestBody Role role) {
		// TODO Auto-generated method stub
		return roleservice.insertData(role);
	}

	@PutMapping(path="/updateRole")
	public Role updateRole(@RequestBody Role role) {
		// TODO Auto-generated method stub
		return roleservice.updateRole(role);
	}

	@DeleteMapping(path="/deleteFromRole/{id}")
	public void deleteFromRole(@RequestBody Role role) {
		roleservice.deleteFromRole(role.getRoleId());

	}
	

}
