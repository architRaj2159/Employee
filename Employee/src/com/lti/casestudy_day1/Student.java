package com.lti.casestudy_day1;
import java.time.LocalDate;

public class Student {
	public int id;
	public String Name;
	public LocalDate dateofAdmission;
	
	
	public Student() {
		
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


	public LocalDate getDateofAdmission() {
		return dateofAdmission;
	}


	public void setDateofAdmission(LocalDate dateofAdmission) {
		this.dateofAdmission = dateofAdmission;
	}
	

}
