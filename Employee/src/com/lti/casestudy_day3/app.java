package com.lti.casestudy_day3;

public class app {
	public static void main(String[] args) {
		address add = new address();
		add.setCity("Delhi");
		add.setPincode(205001);
		
		flat someflat = new flat();
		someflat.setAddress(add);
		someflat.setArea("550 sq. ft.");
		someflat.setType("2 BHK");
		
		//or
		
		flat anotherflat = new flat(add, "750 sp. ft.", "2 BHK");
		
		System.out.println(add.getCity());
		System.out.println(someflat.getArea());
		System.out.println(someflat.getType());
		
		System.out.println(add.getCity()+ " " +anotherflat.getArea()+ " " +anotherflat.getType());
		
		
		//shop someshop = new shop();
	}
}
