package com.training.assignmentsolutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.assignmentsolutions.entities.Order;
import com.training.assignmentsolutions.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;
	
	
	@PostMapping("/neworder")
	public Order addOrder(@RequestBody Order order) {
		return service.addOrder(order);
	}
}
