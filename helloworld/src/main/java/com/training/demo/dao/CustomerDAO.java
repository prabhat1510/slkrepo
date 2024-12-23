package com.training.demo.dao;

import com.training.demo.model.Customer;

public interface CustomerDAO {
	public String addCustomer(Customer customer);

	public Customer getCustomerById(Integer custId);
}
