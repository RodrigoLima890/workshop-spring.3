package com.minhaApiWeb.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minhaApiWeb.demo.entities.Order;
import com.minhaApiWeb.demo.entities.repositories.OrderRepository;
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll(){
		return orderRepository.findAll();
	}

	public Order findOrderById(Long id) {
		Optional<Order> order = orderRepository.findById(id);
		return order.get();
	}
}
