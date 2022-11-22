package com.minhaApiWeb.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minhaApiWeb.demo.entities.Category;
import com.minhaApiWeb.demo.entities.repositories.CategoryRepository;
@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> findAll(){
		return categoryRepository.findAll();
	}

	public Category findCategoryById(Long id) {
		Optional<Category> user = categoryRepository.findById(id);
		return user.get();
	}
}
