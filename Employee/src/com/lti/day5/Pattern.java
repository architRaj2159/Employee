package com.lti.day5;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows: ");
		int rows = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<=rows; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int k = rows; k>=1; k--) {
			for(int l = 0; l<k; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
