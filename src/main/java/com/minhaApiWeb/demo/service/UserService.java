package com.minhaApiWeb.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minhaApiWeb.demo.entities.User;
import com.minhaApiWeb.demo.entities.repositories.UserRepository;
import com.minhaApiWeb.demo.service.exceptions.ResourceNotFoundException;
@Service

public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findUserById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(()-> new ResourceNotFoundException(id));
	}
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	public User update(Long id, User obj) {
		Optional<User> entity = userRepository.findById(id);
		updateUser(entity.get(), obj);
		return userRepository.save(entity.get());
	}

	private void updateUser(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
