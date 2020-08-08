package com.lti.codility.lesson1;

import java.util.Stack;

public class StoneWall {
	public int solution(int[] H) {
		int count = 1;
		Stack<Integer> stack = new Stack<>();
		stack.push(H[0]);
		
		for(int i = 1; i<H.length; i++) {
			if(H[i] > stack.peek()) {
				count++;
				stack.push(H[i]);
			}
			else if(H[i] == stack.peek()) {
			}
			
			else if(H[i]<stack.peek()) {
				while(H[i]<stack.peek()) {
					stack.pop();
					if(stack.empty()) {
						stack.push(H[i]);
						count++;
						break;
					}
					if(H[i] > stack.peek()) {
						count++;
						stack.push(H[i]);
						break;
					}
				}
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		StoneWall sw = new StoneWall();
		int H[] = {5,8};
		
		System.out.println(sw.solution(H));
	}
}
