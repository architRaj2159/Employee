package com.lti.codility.lesson1;

public class MinMaxDivision {
	public int solution(int K, int M, int[] A) {
		int max = 0;
		int min = 0;
		
		for(int i = 0; i<A.length; i++) {
			max += A[i];
			min = Math.max(min, A[i]);
		}
		
		int value = max;
		
		while(min<=max) {
			int mid = (max+min)/2;
			if(check(mid, K-1, A)) {
				max = mid - 1;
				value = mid;
			}else {
				min = mid + 1;
			}
		}
		return value;
	}
	
	public boolean check(int num, int k, int[] A) {
		int largeSum = 0;
		
		for(int i = 0; i<A.length; i++) {
			largeSum += A[i];
			if(largeSum > num) {
				largeSum = A[i];
				k--;
			}
			if(k<0) {
				return false;
			}
		}
		return true;
	} 
	
	public static void main(String[] args) {
		MinMaxDivision m = new MinMaxDivision();
		int A[] = {2,1,5,1,2,2,2};
		int K = 3;
		int M = 5;
		
		System.out.println(m.solution(K, M, A));
		
	}
}
