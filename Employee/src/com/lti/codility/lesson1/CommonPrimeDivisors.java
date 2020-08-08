package com.lti.codility.lesson1;

public class CommonPrimeDivisors {
	public int gcd(int a, int b) {
		if(a%b == 0) {
			return b;
		}else{
			return gcd(b, a%b);
		}
	}
	
	public boolean samePrimeDivisors(int a, int b) {
		int gcd_ab = gcd(a,b);
		while(a!=1) {
			int gcdOfA = gcd(a, gcd_ab);
			if(gcdOfA == 1) {
				break;
			}
			a /= gcdOfA;
		}
		
		if(a!=1) {
			return false;
		}
		
		while(b!=1) {
			int gcdOfB = gcd(b,gcd_ab);
			if(gcdOfB == 1) {
				break;
			}
			b /= gcdOfB;
		}
		
		return b == 1;
	}
	
	public int solution(int[] A, int[] B) {
		int count = 0;
		for(int i = 0; i<A.length; i++) {
			if(samePrimeDivisors(A[i], B[i])) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		CommonPrimeDivisors cpd = new CommonPrimeDivisors();
		int A[] = {15,10,3};
		int B[] = {75,30,5};
		
		System.out.println(cpd.solution(A, B));
	}
}
