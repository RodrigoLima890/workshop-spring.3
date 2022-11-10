package com.minhaApiWeb.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaApiWeb.demo.entities.User;
import com.minhaApiWeb.demo.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	@GetMapping
	public ResponseEntity<List<User>> FindAll(){
		List<User> users = service.findAll();
		return ResponseEntity.ok().body(users);
	}
	@GetMapping("/{userId}")
	public ResponseEntity<User> findById(@PathVariable(name = "userId")  Long id){
		User user = service.findUserById(id);
		return ResponseEntity.ok().body(user);
	}

}
