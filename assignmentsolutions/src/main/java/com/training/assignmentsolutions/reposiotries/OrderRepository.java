package com.training.assignmentsolutions.reposiotries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.assignmentsolutions.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
