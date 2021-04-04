package com.example.bootdemorest.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.bootdemorest.daoService.UserDaoService;
import com.example.bootdemorest.exception.UserNotFoundException;
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
	public User retrieveUser(@PathVariable String id) throws UserNotFoundException {
		User user = service.findOne(id);
		if (user == null) {
			throw new UserNotFoundException("id : " + id);
		}
		return user;
	}

	/*
	 * @PostMapping("/user") public void createUser(@RequestBody User user) { User
	 * savedUser = service.save(user); }
	 */

	// method that posts a new user detail and returns the status of HTTP and
	// location of the user resource
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = service.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable String id) throws UserNotFoundException {
		User user = service.findOne(id);
		if (user == null)
			throw new UserNotFoundException("id : " + id);

	}

}
