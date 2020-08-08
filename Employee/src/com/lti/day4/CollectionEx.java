package com.lti.day4;

import java.util.List;

import com.lti.casestudy_day4.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionEx {
	public static void main(String[] args) {
		//Angular brackets notation is called as generics in java
		//what we are doing is specifying what type of element we want to store in the collection
		
		//ArrayList<String> list1 = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("Oracle");
		list1.add("Python");
		list1.add(".Net");
		list1.add("Java");
		
		
		//Now let's see different ways of iterating over the list
		System.out.println("-------using traditional Loop---------");
		for(int i = 0; i<list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(str);
		}
		
		
		
		System.out.println("----------using enhanced for each loop----------");
		for(String str: list1) {
			System.out.println(str);
		}
		
		
		
		System.out.println("------------Using lambda style for each------------");
		list1.forEach(str -> System.out.println(str));
		
		
		
		
		System.out.println("------------using the internal iterator API--------------");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		//Now let's create a list for storing objects of some user defined class
		List<Student> list2 = new ArrayList<Student>();
		//Try adding 2 or 3 students data in the above list and then display the same using any looping construct you like
		
			list2.add(new Student(1, "Archit", LocalDate.of(1997, 11, 19)));
			list2.add(new Student(2, "Tanmay", LocalDate.of(1997, 12, 21)));
			list2.add(new Student(3, "Sarthak", LocalDate.of(1998, 9, 07)));
			list2.add(new Student(4, "Ankur", LocalDate.of(1996, 9, 16)));
			
			for(Student student: list2) {
				System.out.println(student.getId()+ "  " +student.getName()+ "  " +student.getDateofBirth());
			}
		
		
	}

}
