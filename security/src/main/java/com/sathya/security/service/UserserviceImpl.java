package com.sathya.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.security.data.UserRepository;
import com.sathya.security.entities.User;
@Service
public class UserserviceImpl implements Userservice {
	@Autowired 
	UserRepository userRepository;

	@Override
	public Iterable<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Transactional
	public User insertData(User User) {
		// TODO Auto-generated method stub
		return userRepository.save(User);
	}

	@Transactional
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Transactional
	public void deleteFromUser(Integer id) {
		userRepository.deleteById(id);

	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User insertNewUser(User User) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
