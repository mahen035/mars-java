package com.mars.springjdbc.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mars.springjdbc.config.AppConfig;
import com.mars.springjdbc.dao.ProductDAO;
import com.mars.springjdbc.model.Product;

public class SpringJdbcTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductDAO productDao = context.getBean(ProductDAO.class);
		
		Product prod = new Product("RR101", "Mobile", 50, "ELEX", "SAMSUNG", 999);
		
		productDao.createProduct(prod);
		
		System.out.println("Product Added Successfully...");
	}

}
