package com.minhaApiWeb.demo.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaApiWeb.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
