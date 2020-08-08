package com.lti.mini_project_1;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		bank b = new bank();
		OnYearBasis o = new OnYearBasis();
		ComplaintID c = new ComplaintID();
		TimelyResponse t = new TimelyResponse();
		System.out.println("Welcome to this App!!!");
		System.out.println("1.Search by Bank Name\n2.Search by Year\n3. Search by Complaint ID\n4. Search by Timely Response");
		System.out.print("Enter your Choice (1-4) :- ");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		
		case 1: 
			b.display();
			break;
		case 2:
			o.display();
			break;
		case 3:
			c.display();
			break;
		case 4:
			t.display();
			break;
		}
		sc.close();
	}  

}
