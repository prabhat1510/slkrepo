package com.training.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.demo.model.Customer;

@Component
public class CustomerDAOImpl implements CustomerDAO {
	
	private static List<Customer> listOfCustomer = new ArrayList<Customer>();
	
	@Override
	public String addCustomer(Customer customer) {
		listOfCustomer.add(customer);
		return "Customer added successfully";
	}

	@Override
	public Customer getCustomerById(Integer custId) {
		Customer customer = listOfCustomer.stream().filter((x)->x.getCustId() == custId).findAny().get();
		return customer;
	}

}
