package com.minhaApiWeb.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minhaApiWeb.demo.entities.Product;
import com.minhaApiWeb.demo.entities.repositories.ProductRepository;
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll(){
		return productRepository.findAll();
	}

	public Product findProductById(Long id) {
		Optional<Product> order = productRepository.findById(id);
		return order.get();
	}
}
