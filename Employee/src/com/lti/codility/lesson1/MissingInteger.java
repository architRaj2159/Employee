package com.lti.codility.lesson1;

import java.util.*;

public class MissingInteger {
	public int solution(int[] A) {
		Set<Integer> sets = new TreeSet<>();
		Set<Integer> sets2 = new TreeSet<>();
		
		for(int i = 0; i<A.length; i++) {
			sets.add(A[i]);
			sets2.add(i+1);
		}
		
		for(int i: sets2) {
			if(!sets.contains(i)) {
				return i;
			}
		}
		
		if(sets2.size() == sets.size()) {
			return sets2.size() + 1;
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		MissingInteger m = new MissingInteger();
		int A[] = {1,2,5,7,4,6};
		int b = m.solution(A);
		System.out.println(b);
	}
}
