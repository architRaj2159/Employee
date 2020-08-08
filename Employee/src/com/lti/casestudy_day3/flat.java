package com.lti.casestudy_day3;

public class flat extends property {
	private String type;
	
	public flat() {
		
	}

	public flat(address address, String area, String type) {
		super(address, area);
		this.type = type;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	

	
	

}
	