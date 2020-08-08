package com.lti.codility.lesson1;

public class KadanesAlgo {
	public int solution(int[] A) {
		int globalMax = 0;
		int localMax = 0;
		
		for(int i = 0; i<A.length; i++) {
			localMax = Math.max(0, localMax + A[i]);
			globalMax = Math.max(globalMax, localMax);
			
			/*if(localMax > globalMax) {
				globalMax = localMax;
			}*/
		}
		
		return globalMax;
	}
	public static void main(String[] args) {
		KadanesAlgo ka = new KadanesAlgo();
		int A[] = {5,-4,8,-10,-2,4,-3,2,7,-8};
		
		System.out.println(ka.solution(A));
	}
}
