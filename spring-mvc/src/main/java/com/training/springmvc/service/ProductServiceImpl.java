package com.training.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.dao.ProductDAO;
import com.training.springmvc.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO productDao;

	@Override
	public Product getProductById(String prodId) {
		
		return productDao.getProductById(prodId);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

}
