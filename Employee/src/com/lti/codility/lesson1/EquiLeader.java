package com.lti.codility.lesson1;

import java.util.Stack;

public class EquiLeader {
	public int solution(int[] A) {
		int count = 0;
		int candidate = -1;
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i<A.length; i++) {
			if(stack.empty() || A[i] == stack.peek()) {
				stack.push(A[i]);
			}else if(A[i] != stack.peek()){
					stack.pop();
				}
		}
		if(!stack.isEmpty()) {
			candidate = stack.peek();
			for(int i = 0; i<A.length; i++) {
				if(A[i] == candidate) {
					count++;
				}
			}
		}
		
		int equiLeaders = 0;
		if(count > A.length/2) {
			int equiLeaderCount = 0;
			for(int i = 0; i<A.length; i++) {
				if(A[i] == candidate) {
					equiLeaderCount++;
				}
				boolean equiLeaderFoundInFirstHalf = equiLeaderCount > (i+1)/2 ? true : false;
				int noOfLeadersLeft = count - equiLeaderCount;
				boolean equiLeaderInSecondHalf = noOfLeadersLeft > (A.length- (i +1))/2? true:false;
				
				if(equiLeaderFoundInFirstHalf && equiLeaderInSecondHalf) {
					equiLeaders++;
				}
			}
		}
		return equiLeaders;
}
	
	public static void main(String[] args) {
		EquiLeader e = new EquiLeader();
		int A[] = {4,3,4,4,4,2};
		
		System.out.println(e.solution(A));
	}
}
