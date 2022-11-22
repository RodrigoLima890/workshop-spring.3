package com.minhaApiWeb.demo.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaApiWeb.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
