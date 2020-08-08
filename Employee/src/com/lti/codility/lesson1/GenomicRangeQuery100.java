package com.lti.codility.lesson1;

import java.util.Arrays;

public class GenomicRangeQuery100 {
	public int[] efficientSolution(String S, int[] P, int[] Q) {
		int[] A = new int[S.length() + 1];
		int[] C = new int[S.length() + 1];
		int[] G = new int[S.length() + 1];
		int[] T = new int[S.length() + 1];
		
		for(int i = 0; i<S.length(); i++) {
			if(S.charAt(i) == 'A') {
				A[i+1] = A[i] + 1;
				C[i+1] = C[i];
				G[i+1] = G[i];
				T[i+1] = T[i];
			}
			if(S.charAt(i) == 'C') {
				A[i+1] = A[i];
				C[i+1] = C[i] + 1;
				G[i+1] = G[i];
				T[i+1] = T[i];
			}
			if(S.charAt(i) == 'G') {
				A[i+1] = A[i];
				C[i+1] = C[i];
				G[i+1] = G[i] + 1;
				T[i+1] = T[i];
			}
			if(S.charAt(i) == 'T') {
				A[i+1] = A[i];
				C[i+1] = C[i];
				G[i+1] = G[i];
				T[i+1] = T[i] + 1;
			}
		}
		
		System.out.println(S);
		System.out.println("A = "+Arrays.toString(A));
		System.out.println("C = "+Arrays.toString(C));
		System.out.println("G = "+Arrays.toString(G));
		System.out.println("T = "+Arrays.toString(T));
		
		int[] result = new int[P.length];
		
		for(int i = 0; i<P.length; i++) {
			int countA = A[Q[i] + 1] - A[P[i]]; // p = 2, q = 4  
			int countC = C[Q[i] + 1] - C[P[i]];
			int countG = G[Q[i] + 1] - G[P[i]];
			int countT = T[Q[i] + 1] - T[P[i]];
			
			if(countA > 0)
				result[i] = 1;
			else if(countC > 0)
				result[i] = 2;
			else if(countG > 0)
				result[i] = 3;
			else if(countT > 0)
				result[i] = 4;
		}
		
		return result;
	}
	
	
	
	
	
	
	public int[] solution(String S, int[] P, int[] Q) {
		int result[] = new int[P.length];
		
		for(int i = 0; i<P.length; i++) {
			int min = 0;
			String str = S.substring(P[i], Q[i] + 1);
			if(str.contains("A"))
				min = 1;
			else if(str.contains("C"))
				min = 2;
			else if(str.contains("G"))
				min = 3;
			else if(str.contains("T"))
				min = 4;
			result[i] = min ;
		}
		return result;
	}
	
	 public static void main(String[] args) {
			String DNA = "CAGCCTA";
			int[] P = {2, 5, 0};
			int[] Q = {4, 5, 6};
			System.out.println(Arrays.toString(new GenomicRangeQuery100().efficientSolution(DNA, P, Q)));
		}
}
