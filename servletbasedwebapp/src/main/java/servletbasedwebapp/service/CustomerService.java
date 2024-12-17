package servletbasedwebapp.service;

import java.util.List;

import servletbasedwebapp.entities.Customer;

public interface CustomerService {
	//Create
	public Customer addCustomer(Customer customer);
	//Retrieve
	public List<Customer> getAllCustomers();
	public Customer getCustomerById(Integer customerId);
	//Update 
	//Delete
}
