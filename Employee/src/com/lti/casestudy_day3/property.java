package com.lti.casestudy_day3;

public class property {
	private address address;
	private String area;
	
	public property() {
		
	}
	
	public property(address address, String area) {
		super();
		this.address = address;
		this.area = area;
	}
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

}
