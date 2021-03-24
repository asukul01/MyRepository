package com.example.bootdemorest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemorest.daoService.UserDaoService;
import com.example.bootdemorest.model.User;

@RestController
public class UserController {

	@Autowired
	private UserDaoService service;

	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping(path = "/users/{id}")
	public User retrieveUser(@PathVariable String id) {
		return service.findOne(id);
	}

	@PostMapping("/user")
	public void createUser(@RequestBody User user) {
		User savedUser = service.save(user);
	}

}
