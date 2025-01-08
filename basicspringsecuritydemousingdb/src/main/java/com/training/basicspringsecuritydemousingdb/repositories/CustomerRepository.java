package com.training.basicspringsecuritydemousingdb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.basicspringsecuritydemousingdb.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
