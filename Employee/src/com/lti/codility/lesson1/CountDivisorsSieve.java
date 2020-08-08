package com.lti.codility.lesson1;

import java.util.Arrays;

public class CountDivisorsSieve {
	public int[] solution(int[] A) {
		
		/*HashMap<Integer, Integer> count = new HashMap<>();
		for(int i:A) {
			Integer val = count.get(i);
			if(val != null) {
				count.put(i, val+1);
			}else {
				count.put(i, 1);
			}
		}*/
		
		//Other way to solve this problem
		
		int maxElem = 0;
		for(int elem: A) {
			maxElem = Math.max(maxElem, elem);
		}
		int countElem[] = new int[maxElem + 1];
		for(int i = 0; i<A.length;i++) {
			countElem[A[i]]++;
		}
		
		
		//The Great Eratosthenes Algorithm
		int[] divisors = new int[countElem.length];
		for(int i = 0; i<divisors.length; i++) {
			if(countElem[i] > 0) {
				for(int j = i; j<divisors.length; j+=i) {
					divisors[j] += countElem[i];
				}
			}
		}
		
		int[] nonDivisors = new int[A.length];
		for(int i = 0; i<nonDivisors.length; i++) {
			nonDivisors[i] = nonDivisors.length - divisors[A[i]];
		}
		//System.out.println(Arrays.toString(divisors));
		//System.out.println(Arrays.toString(countElem));
		//System.out.println(count);
		return nonDivisors;
		
		
		
		/*for(int i = 0; i<A.length; i++) {
		for(int j = 0; j<A.length; j++) {
			if(A[i]%A[j] != 0) {
				P[i] += 1;
			}
		}
		}*/
	}
	public static void main(String[] args) {
		CountDivisorsSieve cds = new CountDivisorsSieve();
		int A[] = {3,1,2,3,6};
		int Q[] = cds.solution(A);
		
		System.out.println(Arrays.toString(Q));
	}
}
