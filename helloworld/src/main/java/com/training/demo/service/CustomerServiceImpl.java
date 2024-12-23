package com.training.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.dao.CustomerDAO;
import com.training.demo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	@Override
	public String addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(Integer custId) {
		return dao.getCustomerById(custId);
	}

}
