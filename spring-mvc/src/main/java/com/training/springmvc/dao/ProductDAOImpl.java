package com.training.springmvc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.springmvc.model.Product;
import com.training.springmvc.model.ProductMapper;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_CREATE_PRODUCT ="insert into product values(?,?,?,?,?,?)";
	
	private final String SQL_GET_PRODUCTS ="select * from product";
	
	private final String SQL_GET_PRODUCT_BY_ID = "select * from product where prod_id =?";
	
	private final int[] stringArgType = { 12 };
	
	@Autowired
	public ProductDAOImpl(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public Product getProductById(String prodId) {
		Product prod = (Product)jdbcTemplate.queryForObject(SQL_GET_PRODUCT_BY_ID, new Object[] {prodId},stringArgType, new ProductMapper());
		return prod;
	}

	public List<Product> getAllProducts() {
		List<Product> prodList = jdbcTemplate.query(SQL_GET_PRODUCTS, new ProductMapper());
		return prodList;
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
