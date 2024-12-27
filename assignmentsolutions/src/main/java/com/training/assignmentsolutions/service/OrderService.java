package com.training.assignmentsolutions.service;

import java.util.List;

import com.training.assignmentsolutions.entities.Order;
import com.training.assignmentsolutions.exceptions.OrderNotFoundException;

public interface OrderService {
	public Order addOrder(Order order);
	public Order retrieveOrderById(Long orderId) throws OrderNotFoundException;
	public List<Order> getOrders();
}
