package com.lti.day5;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number u want fictorial of:- ");
		int f = Integer.parseInt(sc.nextLine());
		int fact = 1;
		
		for(int i = 1; i<=f; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		sc.close();
	}

}
