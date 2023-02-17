package com.sastabasta.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Wishlist {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wishlistId;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "wishlist")
	private List<Product> product;
	
	@OneToOne()
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Wishlist(int wishlistId, List<Product> product, Customer customer) {
		super();
		this.wishlistId = wishlistId;
		this.product = product;
		this.customer = customer;
	}

	public Wishlist() {
		
	}
	
	


	

	
	
	
	

}
