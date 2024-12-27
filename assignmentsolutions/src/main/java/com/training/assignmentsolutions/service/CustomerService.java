package com.training.assignmentsolutions.service;

import java.util.List;

import com.training.assignmentsolutions.entities.Customer;
import com.training.assignmentsolutions.exceptions.CustomerNotFoundException;

public interface CustomerService {
	public Customer addCustomer(Customer customer);
	public Customer retrieveCustomerById(Long customerId) throws CustomerNotFoundException;
	public List<Customer> getCustomers();
}
