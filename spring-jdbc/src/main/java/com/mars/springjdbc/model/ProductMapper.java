package com.mars.springjdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product>{

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product product = new Product();
		product.setProdId(rs.getString("prod_id"));
		product.setProdCategory(rs.getString("prod_category"));
		product.setProdName(rs.getString("prod_name"));
		product.setProdDesc(rs.getString("prod_desc"));
		product.setQuantity(rs.getInt("quantity"));
		product.setPrice(rs.getDouble("price"));
		return product;
	}

}