package com.minhaApiWeb.demo.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaApiWeb.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
