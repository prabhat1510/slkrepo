package com.training.assignmentsolutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.assignmentsolutions.entities.Product;
import com.training.assignmentsolutions.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/newproduct")
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
}
