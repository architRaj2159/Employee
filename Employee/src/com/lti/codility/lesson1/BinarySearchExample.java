package com.lti.codility.lesson1;

public class BinarySearchExample {
	public int solution(int[] A, int N) {
		int len = A.length;
		int beg = 0;
		int end = len - 1;
		int result = -1;
		
		while(beg<=end) {
			int mid = (beg+end)/2;
			if(A[mid] <= N) {
				beg = mid + 1;
				result = mid;
			}else {
				end = mid - 1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		BinarySearchExample bse = new BinarySearchExample();
		
		int A[] = {12,15,15,19,24,31,53,59,60};
		int N = 31;
		
		System.out.println(bse.solution(A,N));
	}
}
