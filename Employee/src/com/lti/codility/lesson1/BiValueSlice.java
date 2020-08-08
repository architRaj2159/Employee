package com.lti.codility.lesson1;

import java.util.Stack;

public class BiValueSlice {
	public int solution(int[] A) {
		
		Stack<Integer> stack = new Stack<>();
		int count = 0;
		
		for(int i = 0; i<A.length; i++) {
			for(int j = 1; j<A.length; j++) {
				if(A[i] == A[j]) {
					count++;
				}
			}
		}
		
		
		
		
		return 0;
	}
}
