package serveletbasedwebapp.dao;

import serveletbasedwebapp.model.Customer;

public interface CustomerDAO {
	public String addCustomer(Customer customer);
	public Customer getCustomerById(Integer custId);
}
