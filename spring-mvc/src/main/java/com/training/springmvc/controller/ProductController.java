package com.training.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.springmvc.model.Product;
import com.training.springmvc.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/list")
	public String getProductDetails(ModelMap map) {
		
		List<Product> prodList = productService.getAllProducts();
		map.addAttribute("productDetail", prodList);
		return "products";
		
	}
	
	@GetMapping("/byId/{id}")
	public String getProductById(@PathVariable String id, ModelMap map) {
		
		Product prod = productService.getProductById(id);
		map.addAttribute("product", prod);
		return "singleProduct";
	}
	
	

}
