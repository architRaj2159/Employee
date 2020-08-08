package com.lti.codility.lesson1;

public class CountDivisors {
	public int solution(int A, int N, int K) {
		/*if(A%K == 0 || N%K == 0) {
			return (N-A)/K + 1;
		}else {
			return (N/K - A/K);
		}*/
		
		int start = (int) Math.ceil(A/(double)K);
		int end = (int) Math.floor(N/(double)K);
		return end-start+1;
	}
	public static void main(String[] args) {
		CountDivisors cd = new CountDivisors();
		int value = cd.solution(5, 10, 2);
		System.out.println(value);
	}
}
