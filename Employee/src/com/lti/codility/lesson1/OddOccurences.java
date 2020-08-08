package com.lti.codility.lesson1;

import java.util.HashMap;
import java.util.Map;

public class OddOccurences {
	public int solution(int[] A) {
		/*int count;
		for(int i = 0; i<A.length; i++) {
			count = 0;
			for(int j = 0; j<A.length; j++) {
				if(A[i]==A[j]) {
					count++;
				}
			}
			if(count%2 != 0) {
				return A[i];
			}
		}
		return -1;*/
		
		
		HashMap<Integer, Integer> hash = new HashMap<>();
		int count = 0;
		
		for(int i = 0; i<A.length; i++) {
			if(hash.containsKey(A[i])) {
				hash.put(A[i], hash.get(A[i]) + 1);
			} else {
				hash.put(A[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> value: hash.entrySet()) {
			if(value.getValue()%2 != 0) {
				count = value.getKey();
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		OddOccurences obj = new OddOccurences();
		int arr[] = {1,2,3,4,2,3,1,5,4};
		int ans = obj.solution(arr);
		System.out.println(ans);
	}
}
