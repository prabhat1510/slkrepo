package com.training.cafeapp.manytomany;

public interface OrderService {
	public Order addNewOrder(Order order);
	public Order retrieveOrder(Integer orderId);
}
