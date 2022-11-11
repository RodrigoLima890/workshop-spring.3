package com.minhaApiWeb.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaApiWeb.demo.entities.Order;
import com.minhaApiWeb.demo.entities.User;
import com.minhaApiWeb.demo.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> orders = service.findAll();
		return ResponseEntity.ok().body(orders);
	}
	@GetMapping("/{orderId}")
	public ResponseEntity<Order> findOrderById(@PathVariable(name = "orderId")  Long id){
		Order order = service.findOrderById(id);
		return ResponseEntity.ok().body(order);
	}

}
