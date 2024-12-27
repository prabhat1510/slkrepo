package com.training.assignmentsolutions.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.assignmentsolutions.entities.Product;
import com.training.assignmentsolutions.exceptions.ProductNotFoundException;
import com.training.assignmentsolutions.reposiotries.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repo;
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product retrieveProductById(Long orderId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCategoryAndPriceGTHundred(String category) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCategory(String category) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCategoryWithDiscountTenPercent(String category) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCustomerTierBetweenTwoDates(String tier, LocalDate date1, LocalDate date2)
			throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getCheapestProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
