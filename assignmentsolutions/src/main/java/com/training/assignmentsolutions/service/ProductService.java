package com.training.assignmentsolutions.service;

import java.time.LocalDate;
import java.util.List;

import com.training.assignmentsolutions.entities.Product;
import com.training.assignmentsolutions.exceptions.ProductNotFoundException;

public interface ProductService {
	public Product addProduct(Product product);
	public Product retrieveProductById(Long orderId) throws ProductNotFoundException;
	public List<Product> getProducts();
	
	public List<Product> getProductsByCategoryAndPriceGTHundred(String category) throws ProductNotFoundException;
	public List<Product> getProductsByCategory(String category) throws ProductNotFoundException;
	public List<Product> getProductsByCategoryWithDiscountTenPercent(String category) throws ProductNotFoundException;
	public List<Product> getProductsByCustomerTierBetweenTwoDates(String tier,LocalDate date1,LocalDate date2) throws ProductNotFoundException;
	public List<Product> getCheapestProductByCategory(String category);
}
