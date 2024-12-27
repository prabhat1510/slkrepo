package com.training.cafeapp.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/manytomany")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping("/newproduct")
	public Product addNewProduct(@RequestBody Product product) {
		return service.addNewProduct(product);
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") Integer productId) {
		return service.retrieveProduct(productId);
	}

}
