package com.training.springmvc.service;

import java.util.List;

import com.training.springmvc.model.Product;

public interface ProductService {
	
Product getProductById(String prodId);
	
	List<Product> getAllProducts();
	
	boolean deleteProduct(Product product);
	
	boolean updateProduct(Product product);

}
