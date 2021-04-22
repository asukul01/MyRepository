package com.socialMedia.base.user;

import java.net.URI;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

@RestController
public class UersResource {

	@Autowired
	private UserDaoService service;

	// Retrieve all users
	// GET /users
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}

	// Retrieve a User
	// GET /users/{id}
	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUserById(@PathVariable int id) {
		User user = service.findUser(id);

		if (user == null)
			throw new UserNotFoundException("id " + id + " is not found !");
		// HATEOAS - Hypermedia as the engine of application state
		// link to all users - context_path + "/users"

		EntityModel<User> resource = EntityModel.of(user);

		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllUsers());

		resource.add(linkTo.withRel("all-users"));

		return resource;
	}

	// Create a User
	// input - details of the user; output - CREATED and Return the
	// created URI
	// POST /users
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);
		// how to return the created status
		// how to return the URI /user/{id}

		URI loc = (URI) ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(loc).build();

	}

	// Delete a User
	// DELETE /users/{id}
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable int id) {
		User user = service.findUser(id);
		if (user == null) {
			throw new UserNotFoundException("id " + id + " is not found !");
		} else {
			user = service.deleteById(id);
			return ResponseEntity.noContent().build();
		}
	}

}
