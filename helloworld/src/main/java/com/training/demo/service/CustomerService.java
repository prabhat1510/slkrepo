package com.training.demo.service;

import com.training.demo.model.Customer;

public interface CustomerService {
	public String addCustomer(Customer customer);

	public Customer getCustomerById(Integer custId);
}