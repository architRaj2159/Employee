package com.lti.casestudy_day4;
public class Info {

	public void display(Student student) {
		System.out.println("id: "+ student.getId());
		System.out.println("Name: "+ student.getName());
		System.out.println("Date of Birth: "+ student.getDateofBirth());
		System.out.println("-------------------------------------");
		
	}
	
	public void display(Course course) {
		System.out.println("id: "+ course.getId());
		System.out.println("Name: "+ course.getName());
		System.out.println("Duration (in days) : "+ course.getDuration());
		System.out.println("Fees : " + course.getFees());
		System.out.println("-------------------------------------");
		
	}
	
	public void display(Enroll enroll) {
		System.out.println("Enrollment Date : " + enroll.getEnrollmentDate());
		display(enroll.getCourse());
		display(enroll.getStudent());
		System.out.println("-------------------------------------");
		
	}
}

