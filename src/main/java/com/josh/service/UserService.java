package com.josh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.josh.model.User;
import com.josh.repo.UserRepository;

public class UserService {
	@Autowired
	UserRepository repo;
	
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	public Optional<User> getUserById(int id){
		return repo.findById(id);
	}
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
	public void addUser(User user) {
		repo.save(user);
	}

}
