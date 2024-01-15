package com.training.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	
	private String prodId;
	private String prodName;
	private int quantity;
	private String prodCategory;
	private String prodDesc;
	private double price;

}
