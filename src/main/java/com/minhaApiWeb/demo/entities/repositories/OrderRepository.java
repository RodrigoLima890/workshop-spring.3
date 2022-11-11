package com.minhaApiWeb.demo.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaApiWeb.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
