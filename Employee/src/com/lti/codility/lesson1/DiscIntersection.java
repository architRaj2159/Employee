package com.lti.codility.lesson1;

import java.util.Arrays;

public class DiscIntersection {
	public int solution(int[] A) { 
	 
	  long[] left = new long[A.length];
	  long[] right = new long[A.length];

	  for (int i = 0; i < A.length; i++) {
	    left[i] = i - (long) A[i];
	    right[i] = i + (long) A[i];
	  }

	  Arrays.sort(left);
	  Arrays.sort(right);

	  int intersection = 0;
	  int j = 0;

	  for (int i = 0; i < A.length; i++) {
	    while (j < A.length && right[i] >= left[j]) {
	      intersection += j;
	      intersection -= i;
	      j++;
	    }
	  }

	  if (intersection > 10000000) return -1;
	  return intersection;
	    }
	public static void main(String[] args) {
		DiscIntersection d = new DiscIntersection();
		int[] A = {1, 5, 2, 1, 4, 0};
		int ans = d.solution(A);
		
		System.out.println(ans);
	}
}
