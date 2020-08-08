package com.lti.codility.lesson1;

public class Prefix_sum {
	public int[] prefix(int[] A) {
		int n = A.length;
		int[] P = new int[n+1];
		for(int k = 1; k<=n; k++) {
			P[k] = P[k-1] + A[k-1];
		}
		return P;
	}
	
	public int count_total(int[] P, int x, int y) {
		return (P[y+1] - P[x]);
	}
	
	public static void main(String[] args) {
		Prefix_sum ps = new Prefix_sum();
		
		int B[] = {1,2,3,4,5,2,3,1};
		int[] V = ps.prefix(B);
		
		int ct = ps.count_total(V, 2, 5);
		System.out.println(ct);
	}
}
