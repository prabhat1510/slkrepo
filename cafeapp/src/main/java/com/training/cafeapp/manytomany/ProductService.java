package com.training.cafeapp.manytomany;

public interface ProductService {
	public Product addNewProduct(Product product);
	public Product retrieveProduct(Integer prodId);
}
