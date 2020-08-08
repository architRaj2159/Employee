package com.lti.casestudy_day4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	
	Scanner s = new Scanner(System.in);
	AppEngine appEngine = new InMemoryAppEngine();
	Info info = new Info();
	
	public void showMainScreen() {
		System.out.println("Welcome to SMS (Student Management System) v1.0");
		System.out.println("Tell us who you are (1.Student or 2.Admin)");
		System.out.println("Enter your choice (1 or 2)");
		int choice = Integer.parseInt(s.nextLine());
		switch(choice) {
		case 1: 
			showStudentScreen();
			break;
		case 2:
			showAdminScreen();
			break;
		}
		
	}

	public void showStudentScreen() {
		System.out.println("Welcome Student!!");
		System.out.println("1. Register\n2. Browse all the courses\n3. Enroll for a course");
		System.out.println("Enter your choice: (1-3)");
		int choice = Integer.parseInt(s.nextLine());
		switch(choice) {
		case 1: 
			showRegisterScreen();
			break;
		case 2: 
			showAllCoursesScreen();
			break;
		case 3:
			showEnrollCourseScreen();
			break;
		}
	}

	public void showEnrollCourseScreen() {
		// TODO Auto-generated method stub
		
		
	}

	public void showAllCoursesScreen() {
		// TODO Auto-generated method stub
		
		List<Course> courses = appEngine.listOfCourses();
		courses.forEach(course -> info.display(course));
		System.out.println();
		showMainScreen();
		
		
	}

	public void showRegisterScreen() {
		
		Student student = new Student();
		
		System.out.print("Enter id: ");
		student.setId(Integer.parseInt(s.nextLine()));
		
		System.out.print("Enter Name : ");
		student.setName(s.nextLine());
		
		System.out.print("Enter your date of birth: ");
		String date = s.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date1 = LocalDate.parse(date, formatter);
	
		student.setDateofBirth(date1);
		
		
		appEngine.register(student);
		
		System.out.println("Registration Successful!!!!");
		System.out.println();
		showMainScreen();
	}

	public void showAdminScreen() {
		System.out.println("Welcome Admin!!");
		System.out.println("1. Add new Course\n2. Browse all the courses\n3. Browse Students\n4. Browse all the enrollments");
		System.out.println("Enter your choice: (1-4)");
		Scanner s = new Scanner(System.in);
		int choice = Integer.parseInt(s.nextLine());
		switch(choice) {
		case 1: 
			showEnterCourseScreen();
			break;
		case 2:
			showAllCoursesScreen();
			break;
		case 3:
			showAllStudentsScreen();
			break;
		case 4:
			showAllEnrollmentsScreen();
			break;
		}
		
	}

	private void showAllEnrollmentsScreen() {
		// TODO Auto-generated method stub
		List<Enroll> enroll = appEngine.listOfEnrollments();
		enroll.forEach(enrol -> info.display(enrol));
		System.out.println();
		showMainScreen();
		
	}

	private void showAllStudentsScreen() {
		// TODO Auto-generated method stub
		
		List<Student> students = appEngine.listOfStudents();
		students.forEach(student -> info.display(student));
		System.out.println();
		showMainScreen();
		
		
	}

	private void showEnterCourseScreen() {
		// TODO Auto-generated method stub
		
		
		Course course = new Course();
		
		System.out.print("Enter Course id: ");
		course.setId(Integer.parseInt(s.nextLine()));
		
		System.out.print("Enter Course Name : ");
		course.setName(s.nextLine());
		
		System.out.println("Enter the duration of the course(in days) : ");
		course.setDuration(Integer.parseInt(s.nextLine()));
		
		System.out.println("Enter the fees for the course: ");
		course.setFees(Double.parseDouble(s.nextLine()));
	
		appEngine.introduce(course);
		
		System.out.println("Course Added Successfully!!!!");
		System.out.println();
		showMainScreen();
		
		
	}

}
