package com.lti.codility.lesson1;

public class CaterpillarLogic {
	public boolean solution(int[] A, int s) {
		
		int front = 0;
		int sum = 0;
		int back = 0;
		for(back = 0; back<A.length; back++) {
			while(front<A.length && sum + A[front] <= s) {
				sum += A[front];
				front++;
			}
			if(sum == s) {
				return true;
			}
			sum -= A[back];
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		CaterpillarLogic cp = new CaterpillarLogic();
		int A[] = {6,2,7,4,1,3,6};
		int s = 12;
		
		System.out.println(cp.solution(A, s));
	}
}
