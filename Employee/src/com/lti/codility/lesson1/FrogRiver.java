package com.lti.codility.lesson1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FrogRiver {

	public int solution(int X, int[] A) {
		
		int value = -1;
		
		Set<Integer> requiredSet = new HashSet();
		for(int i = 1; i<=X; i++) {
			requiredSet.add(i);
		}
		
		//Set<Integer> currentSet = new HashSet();
		
		for(int j = 0; j<A.length; j++) {
			//requiredSet.add(A[j]);
			
			if(requiredSet.contains(A[j])) {
				requiredSet.remove(A[j]);
			}
			if(requiredSet.isEmpty()) {
				return j;
			}
			//if(currentSet.size()>requiredSet.size()) continue;
			//if(currentSet.containsAll(requiredSet)) {
				// value = j;
				 //break;
			//}
		}
		return value;
		
	}
	
	public static void main(String[] args) {
		FrogRiver fr = new FrogRiver();
		int arr[] = {1,3,1,4,2,3,5,4};
		int X = 5;
		int h = fr.solution(X, arr);
		
		System.out.println(h);
		
	}
}
