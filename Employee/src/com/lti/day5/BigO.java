package com.lti.day5;

import java.util.Scanner;

public class BigO {
		
		String[] names = {"Archit", "Tanmay", "Sarthak", "Ankur", "Garima", "Mahima"};
		public boolean search(String name){
			for(int i = 0; i<names.length; i++) {
				if(names[i].equals(name)) {
					System.out.println("Congratulations!!! We found you!!!");
					return true;
				}
			}
			System.out.println("The name you entered is not in an array");
			return false;
		}
		
		
		//Example for complexity of BigO(n+m)
		public void doSomething(int[] arr1, int[] arr2) {
			for(int i = 0; i<arr1.length; i++) {
				System.out.println(arr1[i]);
			}
			for(int j = 0; j<arr2.length; j++) {
				System.out.println(arr2[j]);
			}
		}
		
		
		//Example for complexity BigO(n*m)
		//In case if we have nested loops, then the Big O complexity will be:
		//in case if j<arr.length, then the BigO complexity is O(n^2)
		//in case if j<10, then the BigO complexity is O(n*10) or O(10n)
		//in case if j<=i, then the BigO complexity is O(n^2)
		public void multiplication(int[] arr) {
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<=i; j++) {
					System.out.println(arr[j]);
				}
			}
		}
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name to search in the given array: ");
			String name = sc.nextLine();
			
			int[] arr1 = {1,2,3,4,5,6,7,8,9};
			int[] arr2 = {2,4,5,32,4,5,3,1,5,67,4};
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			BigO obj = new BigO();
			
			obj.search(name);
			obj.doSomething(arr1, arr2);
			obj.multiplication(arr);
			
			sc.close();
			
		}

}
