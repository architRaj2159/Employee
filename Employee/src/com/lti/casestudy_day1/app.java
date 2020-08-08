package com.lti.casestudy_day1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class app {
	private static void scenario1() {
		Student s1 = new Student();
		s1.setId(100);
		s1.setName("Archit");
		s1.setDateofAdmission(LocalDate.of(2015, 03, 03));
		
		Student s2 = new Student();
		s2.setId(101);
		s2.setName("Ankur");
		s2.setDateofAdmission(LocalDate.of(2012, 05, 23));
		
		Student s3 = new Student();
		s3.setId(102);
		s3.setName("Sarthak");
		s3.setDateofAdmission(LocalDate.of(2016, 07, 13));
		
		Info i = new Info();
		
		i.display(s1);
		i.display(s2);
		i.display(s3);
		
		
	}
	
	private static void scenario2() {
		
		Info d = new Info();
		
		Student[] students = new Student[3];
		
		students[0] = new Student();
		students[0].setId(100);
		students[0].setName("Archit");
		students[0].setDateofAdmission(LocalDate.of(2015, 03, 03));
		
		students[1] = new Student();
		students[1].setId(101);
		students[1].setName("Ankur");
		students[1].setDateofAdmission(LocalDate.of(2012, 05, 23));
		
		students[2] = new Student();
		students[2].setId(102);
		students[2].setName("Sarthak");
		students[2].setDateofAdmission(LocalDate.of(2016, 07, 13));
		
		
		
		for(int i = 0; i < 3; i++) {
			d.display(students[i]);
		}
		
		
	}
	
	public static void scenario3() {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] stu = new Student[3];
		
		for(int i = 0; i<3; i++) {
		
			stu[i] = new Student();
			System.out.print("Enter student " + (i+1) + " id: ");
			stu[i].setId(Integer.parseInt(sc.nextLine()));
		
			System.out.print("Enter Student " + (i+1) + " Name: ");
			stu[i].setName(sc.nextLine());
		
			System.out.print("Enter Student " + (i+1) + " Date FORMAT DD MM YYYY: ");
			String date = sc.nextLine();
		
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
			LocalDate date1 = LocalDate.parse(date, formatter);
		
			stu[i].setDateofAdmission(date1);
		}		
		
		Info dis = new Info();
		
		for(Student item: stu) {
			dis.display(item);
		}
		
	}
	public static void main(String[] args) {
		
		//scenario1();
		//scenario2();
		scenario3();

	}

}
