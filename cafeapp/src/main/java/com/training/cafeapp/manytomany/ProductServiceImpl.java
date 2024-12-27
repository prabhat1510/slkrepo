package com.training.cafeapp.manytomany;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repo;

	@Override
	public Product addNewProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public Product retrieveProduct(Integer productId) {
		Optional<Product> product = repo.findById(productId);
		if(product.isPresent()) {
			return product.get();
		}else {
			return null;
		}
		
	}

}
