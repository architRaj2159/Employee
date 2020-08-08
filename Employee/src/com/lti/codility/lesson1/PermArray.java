package com.lti.codility.lesson1;

import java.util.ArrayList;
import java.util.List;


public class PermArray {
	public int solution(int[] A) {
		
		List<Integer> B = new ArrayList<Integer>();
		
		for(int i = 0; i<A.length; i++) {
			B.add(A[i]);
		}
		
		B.sort(null);
		
		for(int i = 0; i<A.length; i++) {
			if(i+1 != B.get(i)) {
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		PermArray p = new PermArray();
		int arr[] = {1,2,4};
		
		int h = p.solution(arr);
		
		System.out.println(h);
	}

}
