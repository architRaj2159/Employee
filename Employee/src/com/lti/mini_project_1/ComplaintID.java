package com.lti.mini_project_1;

import java.io.File;
import java.util.Scanner;

public class ComplaintID {
	public void display() throws Exception{	
	System.out.println("Enter Complaint ID :- ");
	Scanner ob = new Scanner(System.in);
	String word = ob.nextLine();
		
	Scanner sc = new Scanner(new File("C:\\Users\\aryan\\LTI\\FI - LnD Batch Repository - GET-845\\Mini Project\\I\\Problem Statement\\complaints.csv"));  
		sc.useDelimiter(",");    
	while (sc.hasNext())   
	{  
		 String line = sc.nextLine();
		 if (line.contains(word)) {
			 	System.out.println(line); 
		 }
	}

	sc.close();
	ob.close();  
	} 
}
