package com.training.assignmentsolutions.reposiotries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.assignmentsolutions.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
