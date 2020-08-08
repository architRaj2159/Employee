package com.lti.codility.lesson1;

import java.util.Stack;

public class Dominator {
	public int solution(int[] A) {
		int count = 0;
		int storingIndex = -1;
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i<A.length; i++) {
			if(stack.empty()) {
				stack.push(A[i]);
			}else {
				if(stack.peek() == A[i]) {
					stack.push(A[i]);
				}else {
					stack.pop();
				}
			}
		}
		
		if(stack.isEmpty()) return -1;
		int valueInStack = stack.peek();
		
		for(int i = 0; i<A.length; i++) {
			if(A[i] == valueInStack) {
				count++;
				if(storingIndex < 0) {storingIndex = i;}
			}
		}
		if(count > A.length/2) return storingIndex;
		return -1;
	}
	
	public static void main(String[] args) {
		Dominator dm = new Dominator();
		int A[] = {3,4,3,2,3,-1,3,3};
		
		System.out.println(dm.solution(A));
	}
}
