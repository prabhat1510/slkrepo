package com.training.cafeapp.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/manytomany")
public class OrderController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/neworder")
	public Order addNewOrder(@RequestBody Order order) {
		return service.addNewOrder(order);
	}
	
	@GetMapping("/order/{id}")
	public Order getOrderById(@PathVariable("id") Integer orderId) {
		return service.retrieveOrder(orderId);
	}

}
