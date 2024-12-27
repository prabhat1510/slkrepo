package com.training.assignmentsolutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.assignmentsolutions.entities.Customer;
import com.training.assignmentsolutions.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	
	@PostMapping("/newcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
}
