package com.sathya.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entities.User;
import com.sathya.security.service.UserserviceImpl;


@RestController
@RequestMapping(path="/user")
public class UserController {
	@Autowired 
	UserserviceImpl userservice;

	@GetMapping(path="/getAllUser")
	public Iterable<User> getAllUser() {
		return userservice.getAllUser();
	}

	@PostMapping(path="/addUser")
	public User insertData(@RequestBody User user) {
		return userservice.insertData(user);
	}

	@PutMapping(path="/updateUser")
	public User updateUser(@RequestBody User user) {
		return userservice.updateUser(user);
	}

	@DeleteMapping(path="/deleteFromUser/{id}")
	public void deleteFromUser(@RequestBody User user) {
		userservice.deleteFromUser(user.getId());;

	}
	

}
