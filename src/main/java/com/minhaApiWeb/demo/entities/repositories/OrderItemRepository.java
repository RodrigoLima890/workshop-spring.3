package com.minhaApiWeb.demo.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaApiWeb.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
