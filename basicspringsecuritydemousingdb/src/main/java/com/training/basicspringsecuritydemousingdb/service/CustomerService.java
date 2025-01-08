package com.training.basicspringsecuritydemousingdb.service;

import java.util.List;

import com.training.basicspringsecuritydemousingdb.entities.Customer;

public interface CustomerService {
	
	//Create
	public Customer addNewCustomer(Customer customer);
	//Retrieve
	public Customer getCustomer(Integer customerId);
	//Update
	public Customer updateCustomer(Customer customer);
	//Delete
	public String deleteCustomer(Integer customerId);
	
	//Retrieve All
	public List<Customer> getCustomers();

}
