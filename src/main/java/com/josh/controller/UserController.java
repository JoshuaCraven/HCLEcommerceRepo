package com.josh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.josh.model.User;
import com.josh.service.UserService;

public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/Users")
	public List<User> listAllUsers(){
		return service.getAllUsers();
	}
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		service.addUser(user);
	}
	@DeleteMapping("/user/{userId}")
	public void deleteUser(@PathVariable int userId) {
		service.deleteUser(userId);
	}

}
