package servletbasedwebapp.service;

import java.util.List;

import servletbasedwebapp.dao.CustomerDAO;
import servletbasedwebapp.dao.CustomerDAOImpl;
import servletbasedwebapp.entities.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerDAO customerDao = new CustomerDAOImpl();
	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerDao.addCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		return customerDao.getCustomerById(customerId);
	}

}
