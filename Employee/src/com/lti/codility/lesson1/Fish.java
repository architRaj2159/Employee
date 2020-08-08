package com.lti.codility.lesson1;

import java.util.Stack;

public class Fish {
	public int solution(int[] A, int[] B) {
		
		Stack<Integer> s = new Stack<>();
		int count = 0;
		
		for(int i = 0; i<A.length; i++){
			int weightOfCurrentFish = A[i];
			int direction = B[i];
			if(direction == 1) {
				s.push(weightOfCurrentFish);
			}else {
				int weightOfFishInStack = s.isEmpty() ? -1: s.pop();
				while(weightOfFishInStack != -1 && weightOfFishInStack < weightOfCurrentFish) {
					weightOfFishInStack = s.isEmpty() ? -1 : s.pop();
				}
				if(weightOfFishInStack == -1) {
					count += 1;
				}else {
					s.push(weightOfFishInStack);
				}
			}
		}
		
		return count + s.size();
	}
	public static void main(String[] args) {
		Fish fs = new Fish();
		int A[] = {4,3,2,1,5};
		int B[] = {0,1,0,0,0};
		
		System.out.println(fs.solution(A, B));	
	}
}
