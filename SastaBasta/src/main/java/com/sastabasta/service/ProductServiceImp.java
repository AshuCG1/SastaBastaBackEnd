package com.sastabasta.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.sastabasta.entities.Product;
import com.sastabasta.entities.Wishlist;
import com.sastabasta.inputDto.ProductInputDto;
import com.sastabasta.repository.ProductRepository;
import com.sastabasta.repository.WishlistRepository;
@Service
public class ProductServiceImp implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	WishlistRepository wishlistRepository;

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product editProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
		
	}

	@Override
	public Optional<Product> getProductById(int productId) {
		return productRepository.findById(productId);
	}

	@Override
	public List<Product> filterProduct(Map<String, String> map) {
		TreeMap<String, String> sorted = new TreeMap<>();
		sorted.putAll(map);
		List<Product> products=(List<Product>) productRepository.findAll();
		return products.stream()
				.filter(product -> map.get("brand")==null ||  product.getProductBrand().equals(sorted.get("brand")))
			      .filter(product -> map.get("color")==null ||  product.getColour().equals(sorted.get("color")))
			      .filter(product -> map.get("name")==null  ||  product.getProductName().equals(sorted.get("name")))
			      .collect(Collectors.toList());
		
	}

	@Override
	public List<Product> getAllProduct() {
		
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public List<Product> findProductsByBrand(String productBrand) {
		return productRepository.findAllByProductBrand(productBrand);
	}

	@Override
	public List<Product> findProductsByType(String type) {
		return productRepository.findAllByType(type);
	}

	@Override
	public List<Product> findProductsByColour(String colour) {
		return productRepository.findAllByColour(colour);
	}

	@Override
	public Product addProductDto(ProductInputDto productDto) {
		
		Product productInputDto =new Product(); 

	
		productInputDto.setProductId(productDto.getProductId());
		
		productInputDto.setProductName(productDto.getProductName());
		productInputDto.setProductBrand(productDto.getProductBrand());
		productInputDto.setType(productDto.getType());
		productInputDto.setColour(productDto.getColour());
		productInputDto.setImage(productDto.getImage());
		
	
		//return restaurantRepository.save(restaurantInputDto);
		return productRepository.save(productInputDto);
	}

	

	

}
