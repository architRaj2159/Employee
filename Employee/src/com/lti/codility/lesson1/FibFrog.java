package com.lti.codility.lesson1;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;

public class FibFrog {
	public int solution(int[] A) {
		ArrayList<Integer> fibonacci = new ArrayList<>();
		fibonacci.add(0);
		fibonacci.add(1);
		
		while(true) {
			int a = fibonacci.get(fibonacci.size() -1);
			int b = fibonacci.get(fibonacci.size() -2);
			fibonacci.add(a+b);
			if(a+b > A.length) {
				break;
			}
		}
		
		Collections.reverse(fibonacci);
		
		ArrayList<Point> queue = new ArrayList<>();
		queue.add(new Point(-1, 0));
		
		int count = 0;
		while(true) {
			if(count == queue.size()) {
				return -1;
			}
			
			Point currentPoint = queue.get(count);
			
			for(Integer i: fibonacci) {
				int position = currentPoint.x + i;
				
				if(position == A.length) {
					return currentPoint.y + 1;
				}else if((position > A.length) || (position < 0) || (A[position] == 0)) {
					
				}else {
					Point value = new Point(position, currentPoint.y + 1);
					
					queue.add(value);
				}
			}
			count++;
		}
	}
	public static void main(String[] args) {
		FibFrog f = new FibFrog();
		int A[] = {0,0,0,1,1,0,1,0,0,0,0};
		
		System.out.println(f.solution(A));
	}
}
