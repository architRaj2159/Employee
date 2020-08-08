package com.lti.day5;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. for finding fibonacci series: ");
		int fibo = Integer.parseInt(sc.nextLine());
		int a = 0;
		int b = 1;
		
		while(a<=fibo) {
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
		}
		sc.close();
	}
}
