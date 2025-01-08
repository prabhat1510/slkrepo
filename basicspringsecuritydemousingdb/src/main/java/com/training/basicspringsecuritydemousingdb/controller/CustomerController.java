package com.training.basicspringsecuritydemousingdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.basicspringsecuritydemousingdb.entities.Customer;
import com.training.basicspringsecuritydemousingdb.service.CustomerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	// Create
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/new")
	public Customer addNewCustomer(@RequestBody Customer customer) {
		return service.addNewCustomer(customer);
	}

	// Retrieve
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	@GetMapping("/get/{id}")
	public Customer getCustomer(@PathVariable("id") Integer customerId) {
		return service.getCustomer(customerId);
	}

	// Update
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}

	// Delete
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable("id") Integer customerId) {
		return service.deleteCustomer(customerId);
	}

	// Retrieve All
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return service.getCustomers();
	}

}
