package com.lti.casestudy_day4;
import java.time.LocalDate;

public class Student {
	public int id;
	public String Name;
	public LocalDate dateofBirth;
	
	
	public Student() {
		
	}
	
	public Student(int id, String name, LocalDate dateofBirth) {
		super();
		this.id = id;
		Name = name;
		this.dateofBirth = dateofBirth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public LocalDate getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}


	
	

}


