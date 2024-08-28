package com.example.restfull.Api.service.model;
import java.math.BigDecimal;

public class Product {
	private final String id;
	private final String description;
	private final BigDecimal price;
	
	public Product(final String id,String description, final BigDecimal price) {
		this.id = id;
		this.description = description;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description + ", price=" + price + ", getId()=" + getId()
				+ ", getDescription()=" + getDescription() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
