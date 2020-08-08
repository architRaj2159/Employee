package com.lti.codility.practice;

import java.util.Arrays;

public class OneDigit {
	public int solution(int[] A) {
		
		int[] arr = new int[19];
		for(int i = 0; i<A.length; i++) {
			if(A[i] < 0 && A[i] > -10) {
				arr[i] = A[i];
			}else if(A[i] >= 0 && A[i] < 10) {
				arr[i] = A[i];
			}
		}
		
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
	public static void main(String[] args) {
		OneDigit on = new OneDigit();
		int A[] = {-6, -91, 1011, -100, 84, -22, -2};
		System.out.println(on.solution(A));
	}
}
