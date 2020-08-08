package com.lti.codility.lesson1;

public class PassingCars {
	public int solution(int[] A) {
		int[] P = new int[A.length + 1];
		P[0] = 0;
		int sum = 0;
		int allSum = 0;
		for(int k = 1; k<=A.length; k++) {
			P[k] = P[k-1] + A[k-1];
		}
		for(int i = 0; i<A.length; i++) {
			
			if(A[i] == 0) {
				sum = P[A.length] - P[i];
				allSum += sum;
			}
		}
		return  (Math.abs(allSum)<=1000000000)?allSum:-1;
	}
	public static void main(String[] args) {
		PassingCars pc = new PassingCars();
		int A[] = {0,1,0,1,1};
		int C = pc.solution(A);
		
		System.out.println(C);
		
		
	}
}
