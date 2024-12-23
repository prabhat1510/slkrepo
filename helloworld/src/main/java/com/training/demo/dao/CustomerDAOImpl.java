package com.training.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.demo.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public String addCustomer(Customer customer) {
		String sqlQuery = "insert into customer values(?,?)";
		jdbcTemplate.update(sqlQuery, customer.getCustId(),customer.getCustomerName());
		return "Customer added successfully";
	}

	@Override
	public Customer getCustomerById(Integer custId) {
		String sqlQuery="select * from customer where custId=?";
		return jdbcTemplate.queryForObject(sqlQuery, BeanPropertyRowMapper.newInstance(Customer.class),custId);
	}

}
