package com.josh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int productId; //Primary key for Product table.
	private String name;
	private String description;
	private double price;
	private double weight;
	private int quantity;
	private String image;
	
	
	
	
	public String toString() {
		return "Product Id: "+productId+" name: "+name+" description: "+description+" price: "+price+" weight: "+weight+" quantity: "+
				quantity+" image: "+image;
	}
	



}
