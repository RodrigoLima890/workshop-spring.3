package com.minhaApiWeb.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaApiWeb.demo.entities.Product;
import com.minhaApiWeb.demo.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> products = service.findAll();
		return ResponseEntity.ok().body(products);
	}
	@GetMapping("/{orderId}")
	public ResponseEntity<Product> findProductById(@PathVariable(name = "orderId")  Long id){
		Product product = service.findProductById(id);
		return ResponseEntity.ok().body(product);
	}

}
