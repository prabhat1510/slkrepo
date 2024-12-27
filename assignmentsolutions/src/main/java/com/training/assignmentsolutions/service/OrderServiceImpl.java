package com.training.assignmentsolutions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.assignmentsolutions.entities.Order;
import com.training.assignmentsolutions.exceptions.OrderNotFoundException;
import com.training.assignmentsolutions.reposiotries.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository repo;
	
	@Override
	public Order addOrder(Order order) {
		return repo.save(order);
	}

	@Override
	public Order retrieveOrderById(Long orderId) throws OrderNotFoundException{
		Optional<Order> order = repo.findById(orderId);
		if(order.isPresent()) {
			return order.get();
		}else {
			throw new OrderNotFoundException("Order with order id "+orderId+" doesn't exists");
		}
	}

	@Override
	public List<Order> getOrders() {
		return (List<Order>) repo.findAll();
	}

}
