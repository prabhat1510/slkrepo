package serveletbasedwebapp.service;

import serveletbasedwebapp.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	public String addCustomer(Customer customer) {
		CustomerService service = new CustomerServiceImpl();
		return service.addCustomer(customer);
	}

	public Customer getCustomerById(Integer custId) {
		CustomerService service = new CustomerServiceImpl();
		return service.getCustomerById(custId);
	}

}
