package com.lti.codility.lesson1;

public class GenomicRangeQuery {
	public int[] solution(String S, int P[], int Q[]) {
		int[] ans = new int[P.length];	
		int[] impact_factor = new int[S.length()];
		
		for(int i = 0; i<S.length(); i++) {
			switch(S.charAt(i)) {
			case 'A':
				impact_factor[i] = 1;
				break;
			case 'C':
				impact_factor[i] = 2;
				break;
			case 'G':
				impact_factor[i] = 3;
				break;
			case 'T':
				impact_factor[i] = 4;
				break;
			}
		}
		
		for(int i = 0; i<P.length; i++) {
			ans[i] = impact_factor[P[i]];
			for(int j = P[i]; j<=Q[i]; j++) {
				ans[i] = Math.min(ans[i], impact_factor[j]);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		GenomicRangeQuery grq = new GenomicRangeQuery();
		
		String str = "CAGCCTA";
		int p[] = {5,5,0};
		int q[] = {4,5,6};
		
		int result[] = grq.solution(str, p, q);
		
		for(int i = 0; i<result.length; i++) {
		System.out.print("[" +result[i]+ "]");
		}
	}

}
