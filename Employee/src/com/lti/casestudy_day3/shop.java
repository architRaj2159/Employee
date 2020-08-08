package com.lti.casestudy_day3;

public class shop extends property {
	private int licenseNo;
	
	public shop() {
		
	}

	public shop(address address, String area, int licenseNo) {
		super(address, area);
		this.licenseNo = licenseNo;
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}
}
