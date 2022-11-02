package com.minhaApiWeb.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaApiWeb.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> FindAll(){
		User u = new User(1L, "João", "joao@email.com", "99999999", "gxssamm");
		return ResponseEntity.ok().body(u);
	}

}
