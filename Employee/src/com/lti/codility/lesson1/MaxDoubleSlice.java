package com.lti.codility.lesson1;

public class MaxDoubleSlice {
	public int solution(int[] A) {
		int Z = A.length -1;
		int[] slice1 = new int[A.length];
		int[] slice2 = new int[A.length];
		slice1[0] = 0;
		slice2[Z] = 0;
		for(int i = 1; i<Z-1; i++) {
			slice1[i] = Math.max(0,slice1[i-1] + A[i]);
			}
		for(int i = Z-1; i>0; i--) {
			slice2[i] = Math.max(0, slice2[i+1]+A[i]);
		}
		
		int maxSum = 0;
		for(int i = 1; i<Z; i++) {
			maxSum = Math.max(maxSum, slice1[i-1]+slice2[i+1]);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		MaxDoubleSlice md = new MaxDoubleSlice();
		int A[] = {3,2,6,-1,4,5,-1,2};
		
		System.out.println(md.solution(A));
	}
}
