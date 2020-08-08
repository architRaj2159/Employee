package com.lti.mini_project_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OnYearBasis {  

	public void display() throws Exception{ 
		String line = "";  
		String splitBy = ",";  
		try{  
			System.out.println("Enter Year");
			Scanner ob = new Scanner(System.in);
			String str = ob.nextLine(); 
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aryan\\LTI\\FI - LnD Batch Repository - GET-845\\Mini Project\\I\\Problem Statement\\complaints.csv"));  
			while ((line = br.readLine()) != null){  
				String[] employee = line.split(splitBy);  
	
				if (employee[0].contains(str)) {
					System.out.println("Employee [Date received=" + employee[0] + ", Product=" + employee[1] + ", Sub-Product=" + employee[2] + ", Issue =" + employee[3] + ", SubIssue= " + employee[4] + ", Company= " + employee[5] 
							+ ", State= " + employee[6] + ", ZipCode = " + employee[7] + ", Submitted= " + employee[8] + ", Date sent to company= " + employee[9] 
									+ ", Company response= " + employee[10] + ", Timely Response= " + employee[11] + ", Consumer Dis = " + employee[12] + ", Complain Id= " + employee[13] +"]");  
					}	  
				}
			}   
			catch (IOException e)   
			{  
				e.printStackTrace();  
			}    
		}  
	}
