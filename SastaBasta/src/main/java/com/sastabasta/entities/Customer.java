package com.sastabasta.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	private int custId;
	private String custName;
	private long mobileNo;	
	private String email;
	
	@JsonIgnore
	@OneToOne(mappedBy = "customer")
	private Wishlist wishlist;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustNameString(String custNameString) {
		this.custName = custNameString;
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
	public Customer(int custId, String custNameString, long mobileNo, String email) {
		super();
		this.custId = custId;
		this.custName = custNameString;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	public Customer() {
		
	} 
	 
	
	

}
