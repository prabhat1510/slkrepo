package com.training.basicspringsecuritydemousingdb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.basicspringsecuritydemousingdb.entities.Customer;
import com.training.basicspringsecuritydemousingdb.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer addNewCustomer(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Customer getCustomer(Integer customerId) {
		Optional<Customer> cust = repo.findById(customerId);
		if(cust.isPresent()) {
			return cust.get();
		}
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		if(repo.existsById(customer.getCustomerId())) {
			Customer cust =repo.save(customer);
			return cust;
		}
		return customer;
	}

	@Override
	public String deleteCustomer(Integer customerId) {
		repo.deleteById(customerId);
		return "Customer with customer id "+customerId+" deleted successfully";
	}

	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) repo.findAll();
	}

}
