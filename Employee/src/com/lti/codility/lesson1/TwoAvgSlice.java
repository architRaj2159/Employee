package com.lti.codility.lesson1;

public class TwoAvgSlice {
	public int solution(int[] A) {
		int[] P = new int[A.length];
		P[0] = 0;
		for(int i = 1; i<A.length; i++) {
			P[i] = P[i-1] + A[i-1];
		}
		
		int sumOfFirstTwoElems = findStartingIndex(P,2);
		int sumOfFirstThreeElems = findStartingIndex(P,3);
		
		double avgOfFirstTwoElems = sum(P, sumOfFirstTwoElems, 2)/2.0;
		double avgOfFirstThreeELems = sum(P, sumOfFirstThreeElems, 3)/3.0; 
		
		return 0;
	}
	
	public int findStartingIndex(int[] P, int length) {
		int index = 0;
		for(int i = 0; i<P.length - length + 1; i++) {
			if(sum(P, i, length)< sum(P,index,length)) {
				index = i;
			}
		}
		return index;
	}
	
	public int sum(int[] P, int start, int end) {
		
		
		return 0;
	}
}
