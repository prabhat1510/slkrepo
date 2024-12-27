package com.training.assignmentsolutions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.assignmentsolutions.entities.Customer;
import com.training.assignmentsolutions.exceptions.CustomerNotFoundException;
import com.training.assignmentsolutions.reposiotries.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Customer retrieveCustomerById(Long customerId) throws CustomerNotFoundException{
		Optional<Customer> customer = repo.findById(customerId);
		if(customer.isPresent()) {
			return customer.get();
		}else {
			throw new CustomerNotFoundException("Customer with customer id "+customerId+" doesn't exists");
		}
	}

	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) repo.findAll();
	}

}
