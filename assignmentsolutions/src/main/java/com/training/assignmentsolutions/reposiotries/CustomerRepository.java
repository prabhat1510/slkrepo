package com.training.assignmentsolutions.reposiotries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.assignmentsolutions.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
