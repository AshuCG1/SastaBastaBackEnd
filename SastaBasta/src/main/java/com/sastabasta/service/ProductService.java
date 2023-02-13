package com.sastabasta.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.sastabasta.entities.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public Product editProduct(Product product);
	public void deleteProduct(int productId);
	public Optional<Product> getProductById(int productId);
	public List<Product> filterProduct(Map<String, String> map);
	
	
}
