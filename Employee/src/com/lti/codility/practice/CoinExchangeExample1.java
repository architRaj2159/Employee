package com.lti.codility.practice;

public class CoinExchangeExample1 {
	public static int[] dynamicCoinChanging1(int[] C, int k) {
        int n = C.length;
        int[] dp = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = C[i - 1]; j < k + 1; j++) {
                dp[j] = Math.min(dp[j - C[i - 1]] + 1, dp[j]);
            }
        }
        return dp;
    }
	public static void main(String[] args) {
		CoinExchangeExample1 cx = new CoinExchangeExample1();
		int[] C = {1,2,5};
		System.out.println(CoinExchangeExample1.dynamicCoinChanging1( C ,10));
	}
}
