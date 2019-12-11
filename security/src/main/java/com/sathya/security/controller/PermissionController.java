package com.sathya.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sathya.security.entities.Permission;
import com.sathya.security.service.PermissionserviceImpl;

@RestController
@RequestMapping(path="/permission")
public class PermissionController {
	@Autowired 
	PermissionserviceImpl permissionservice;

	@GetMapping(path="/getAllPermissions")
	public Iterable<Permission> getAllPermissions() {
		return permissionservice.getAllPermissions();
	}

	@PostMapping(path="/addPermission")
	public Permission insertData(@RequestBody Permission permission) {
		return permissionservice.insertData(permission);
	}

	@PutMapping(path="/updatePermission")
	public Permission updatePermission(@RequestBody Permission permission) {
		return permissionservice.updatePermission(permission);
	}

	@DeleteMapping(path="/deleteFromPermission/{id}")
	public void deleteFromPermission(@RequestBody Integer id) {
		permissionservice.deleteFromPermission(id);

	}
	

}
