package com.lti.codility.lesson1;

import java.util.Arrays;

public class CountSemiPrimes {
	static int[] ArrayF(int n) {
		int[] F = new int[n+1];
		int i = 2;
		while(i*i <= n) {
			if(F[i] == 0) {
				int k = i*i;
				while(k <= n) {
					if(F[k] == 0) {
						F[k] = i;
					}
					k += i;
				}
			}
			i += 1;
		}
		
		return F;
	}
	
	public int[] solution(int N, int[] P, int[] Q) {
		System.out.print("[");
		for(int i = 0; i<=N; i++) {
			System.out.print(i+ ", ");
		}
		System.out.println("]");
		
		System.out.println(Arrays.toString(ArrayF(N)));
		
		int[] factArr = ArrayF(N);
		
		int[] semiPrimes = new int[factArr.length];
		for(int i = 0; i<semiPrimes.length; i++) {
			if(factArr[i] != 0 && factArr[i/factArr[i]] == 0) {
				semiPrimes[i] += 1;
			}
		}
		System.out.println(Arrays.toString(semiPrimes));
		
		int[] prefixSum = new int[semiPrimes.length];
		for(int i = 0; i<semiPrimes.length; i++) {
			if(i != 0){
				prefixSum[i] = prefixSum[i-1] + semiPrimes[i];
			}
		}
		System.out.println(Arrays.toString(prefixSum));
		
		int[] result = new int[P.length];
		for(int i = 0; i<P.length; i++) {
			result[i] = prefixSum[Q[i]] - prefixSum[P[i] - 1];
		}
		return result;
	}
	public static void main(String[] args) {
		int N = 26;
		int P[] = {1,4,16};
		int Q[] = {26,10,20};
		
		System.out.println(Arrays.toString(new CountSemiPrimes().solution(N, P, Q)));
	}
}
