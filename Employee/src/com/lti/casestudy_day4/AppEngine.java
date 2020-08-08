package com.lti.casestudy_day4;

import java.util.*;

public interface AppEngine {
	public void register(Student student);
	public void introduce(Course course);
	public void enroll(Student student, Course course);
	public List<Student> listOfStudents();
	public List<Course> listOfCourses();
	public List<Enroll> listOfEnrollments();

}
