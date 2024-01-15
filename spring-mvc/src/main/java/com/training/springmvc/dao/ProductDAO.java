package com.training.springmvc.dao;

import java.util.List;

import com.training.springmvc.model.Product;


public interface ProductDAO {
	
	Product getProductById(String prodId);
	
	List<Product> getAllProducts();
	
	boolean deleteProduct(Product product);
	
	boolean updateProduct(Product product);
	
	boolean createProduct(Product product);

}
