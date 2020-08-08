package com.lti.day5;

public class ReverseArray {
	public void reverse(int[] N, int n) {
		int[] b = new int[n];
		int j = n;
		for(int i = 0; i<n; i++) {
			b[j-1] = N[i];
			j = j-1;
		}
		
		for(int k = 0; k<n; k++) {
			System.out.print(b[k]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		ReverseArray obj = new ReverseArray();
		
		obj.reverse(arr, arr.length);
		
		
		
	}

}
