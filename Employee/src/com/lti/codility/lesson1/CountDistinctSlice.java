package com.lti.codility.lesson1;

import java.util.HashSet;

public class CountDistinctSlice {
	public int solution(int[] A, int M) {
		int count = 0;
		int back = 0;
		int front = 0;
		HashSet<Integer> hash = new HashSet<>();
		for(back = 0; back<A.length; back++) {
			hash.clear();
			front = back;
			while(front<A.length && (!hash.contains(A[front]))) {
				hash.add(A[front]);
				front++;
				count++;
				System.out.println("Count: " +count+ ", Front: " +front);
			}
			
			hash.remove(A[back]);
		}
		if(count > 1000000000) {
			return 1000000000;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		CountDistinctSlice cds = new CountDistinctSlice();
		int M = 6;
		int A[] = {3,4,5,5,2};
		System.out.println(cds.solution(A, M));
	}
}
