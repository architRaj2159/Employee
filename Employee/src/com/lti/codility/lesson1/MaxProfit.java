package com.lti.codility.lesson1;

public class MaxProfit {
	public int solution(int[] A) {
		int globalMax = 0;
		int localMax = 0;
		//int minPrice = A[0];
		
		if(A.length == 0) {
			return 0;
		}
		
		int[] P = new int[A.length];
		P[0] = 0;
		for(int i = 1; i<A.length; i++) {
			P[i] = A[i] - A[i-1];
		}
		
		for(int i = 0; i<P.length; i++) {
			localMax = Math.max(0, localMax + P[i]);
			globalMax = Math.max(globalMax, localMax);
		}
		
		/*for(int i = 1; i<A.length; i++) {
			int profit = A[i] - minPrice;
			localMax = Math.max(localMax, profit);
			minPrice = Math.min(A[i], minPrice);
		}*/
	
		if(globalMax > 0) return globalMax;
		return 0;
	}
	public static void main(String[] args) {
		MaxProfit mp = new MaxProfit();
		int A[] = {23171, 21011, 21123, 21366, 21013, 21367};
		
		System.out.println(mp.solution(A));
	}
}
