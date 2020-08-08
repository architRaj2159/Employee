package com.lti.codility.lesson1;

import java.util.Stack;

public class RoomDecoration {
	int height = 0;
	Stack<Integer> stack = new Stack<>();
	public int solution(int[] A) {
		int count = A[A.length - 1];
		if(A.length == 0 || A.length == 1) {
			return A.length;
		}
		
		for(int i = 1; i<A.length; i++) {
			if(A[i] >= A[i-1]) {
				continue;
			}else {
				count += A[i-1] - A[i];
			}
		}
		
		
		return count;
	}
	public static void main(String[] args) {
		RoomDecoration rd = new RoomDecoration();
		int A[] = {1,3,2,1,2,1,5,3,3,4,2};
		int B[] = {5,8};
		System.out.println(rd.solution(A));
		System.out.println(rd.solution(B));
		}
}
