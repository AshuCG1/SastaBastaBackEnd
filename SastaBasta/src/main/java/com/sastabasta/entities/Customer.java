package com.sastabasta.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Customer {
	
	@Id
	
	private int custId;
	private String custName;
	private long mobileNo;	
	private String email;
	private String password;
	
	
	@JsonIgnore
	@OneToOne(mappedBy = "customer")
	private Wishlist wishlist;
	
	
	
	
	
	public Customer(int custId, String custName, long mobileNo, String email, Wishlist wishlist,String password) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.wishlist = wishlist;
		this.password=password;
	}
	
	



	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public int getCustId() {
		return custId;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}



	public String getCustName() {
		return custName;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}



	public long getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Wishlist getWishlist() {
		return wishlist;
	}



	public void setWishlist(Wishlist wishlist) {
		this.wishlist = wishlist;
	}
	
	



	public Customer() {
		
	} 
	 
	
	

}
