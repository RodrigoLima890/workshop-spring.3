package com.minhaApiWeb.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaApiWeb.demo.entities.Category;
import com.minhaApiWeb.demo.service.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	@GetMapping
	public ResponseEntity<List<Category>> FindAll(){
		List<Category> category = service.findAll();
		return ResponseEntity.ok().body(category);
	}
	@GetMapping("/{categoryId}")
	public ResponseEntity<Category> findById(@PathVariable(name = "categoryId")  Long id){
		Category category = service.findCategoryById(id);
		return ResponseEntity.ok().body(category);
	}

}
