package serveletbasedwebapp.service;

import serveletbasedwebapp.dao.CustomerDAO;
import serveletbasedwebapp.dao.CustomerDAOImpl;
import serveletbasedwebapp.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	public String addCustomer(Customer customer) {
		CustomerDAO dao = new CustomerDAOImpl();
		return dao.addCustomer(customer);
	}

	public Customer getCustomerById(Integer custId) {
		CustomerDAO dao = new CustomerDAOImpl();
		return dao.getCustomerById(custId);
	}

}
