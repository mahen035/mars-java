package com.mars.springjdbc.dao;

import java.util.List;

import com.mars.springjdbc.model.Product;

public interface ProductDAO {
	
	Product getProductById(String prodId);
	
	List<Product> getAllProducts();
	
	boolean deleteProduct(Product product);
	
	boolean updateProduct(Product product);
	
	boolean createProduct(Product product);

}