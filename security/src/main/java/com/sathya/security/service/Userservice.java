package com.sathya.security.service;

import com.sathya.security.entities.User;

public interface Userservice {
	

	public Iterable<User> getAllUser();

	public User insertData(User user);

	public User updateUser(User user);

	public void deleteFromUser(Integer id);

	public Object getById(Integer id);

	public User insertNewUser(User user);

}
