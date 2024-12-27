package com.training.cafeapp.manytomany;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository repo;

	@Override
	public Order addNewOrder(Order order) {
		return repo.save(order);
	}

	@Override
	public Order retrieveOrder(Integer orderId) {
		Optional<Order> order = repo.findById(orderId);
		if(order.isPresent()) {
			return order.get();
		}else {
			return null;
		}
		
	}

}
