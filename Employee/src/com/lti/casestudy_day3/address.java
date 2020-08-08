package com.lti.casestudy_day3;

public class address {
	private String city;
	
	public address() {
		
	}
	
	public address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	private int pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
