package com.example.restfull.Api.service.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfull.Api.service.model.Product;
import com.example.restfull.Api.service.model.ProductId;

@RestController
public class ProductController {
	
	@GetMapping("/")
	public String hello() {
		return "Welcome Raamaragavan R !";
	}
	
	@PostMapping("/product")
	public ResponseEntity<ProductId> createProduct(@RequestBody final Product product) {
		ProductId result = new ProductId(UUID.randomUUID().toString());
		System.out.println(product);
		return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(result);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> result = new ArrayList<>();
		result.add(new Product("1","producttest 1",new BigDecimal("88.876")));
		result.add(new Product("2","producttest 2",new BigDecimal("79.337")));
		result.add(new Product("3","producttest 3",new BigDecimal("54.717")));
		return result;
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable final String id) {
		System.out.println(id);
		return new Product("3","producttest 3",new BigDecimal("54.717"));
	}
	
	@PatchMapping("/product")
	public void patchProduct(@RequestBody final Product product) {
		System.out.println(product);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable final String id) {
		System.out.println(id);
	}

}
