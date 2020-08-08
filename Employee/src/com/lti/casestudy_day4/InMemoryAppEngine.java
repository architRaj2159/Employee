package com.lti.casestudy_day4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InMemoryAppEngine implements AppEngine {
	
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Enroll> enrollment = new ArrayList<Enroll>();

	@Override
	public void register(Student student) {
		// TODO Auto-generated method stub
		students.add(student);
		
	}

	@Override
	public void introduce(Course course) {
		// TODO Auto-generated method stub
		courses.add(course);
	}

	@Override
	public void enroll(Student student, Course course) {
		// TODO Auto-generated method stub
		Enroll enroll = new Enroll(student, course, LocalDate.now());
		enrollment.add(enroll);
		
	}

	@Override
	public List<Student> listOfStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public List<Course> listOfCourses() {
		// TODO Auto-generated method stub
		return courses;
	}

	@Override
	public List<Enroll> listOfEnrollments() {
		// TODO Auto-generated method stub
		return enrollment;
	}

}
