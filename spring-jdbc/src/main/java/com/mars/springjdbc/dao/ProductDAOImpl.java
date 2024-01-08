package com.mars.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mars.springjdbc.model.Product;

@Component
public class ProductDAOImpl implements ProductDAO{
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_CREATE_PRODUCT ="insert into product values(?,?,?,?,?,?)";
	
	@Autowired
	public ProductDAOImpl(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public Product getProductById(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createProduct(Product product) {
		return jdbcTemplate.update(SQL_CREATE_PRODUCT, product.getProdId(),product.getProdName(),product.getQuantity(),product.getProdCategory(), product.getProdDesc(), product.getPrice()) > 0;
	}

}
