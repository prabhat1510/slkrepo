package serveletbasedwebapp.service;

import serveletbasedwebapp.model.Customer;

public interface CustomerService {
	public String addCustomer(Customer customer);
	public Customer getCustomerById(Integer custId);
}
