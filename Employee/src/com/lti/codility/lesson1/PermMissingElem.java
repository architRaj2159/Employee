package com.lti.codility.lesson1;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
	public int solution(int[] A) {
		
		/*int sumOfElem = 0;
		
		for(int i=0; i<A.length; i++) {
			sumOfElem += A[i];
		}
		
		long expectedSum = ((A.length+1)*(A.length+2))/2;
		
		int missingElem = expectedSum - sumOfElem;
		
		return missingElem;*/
		
		int value = A.length + 1;
		int ans = 0;
		Set newSet = new HashSet();
		
		for(int i = 0; i<A.length; i++) {
			newSet.add(A[i]);
		}
		
		for(int i=1; i<value+1; i++) {
			if(!newSet.contains(i)) {
			ans = i;
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		PermMissingElem p= new PermMissingElem();
		int arr[] = {1,2,3,5,6};
		int value = p.solution(arr);
		System.out.println(value);
	}

}
