package com.lti.codility.lesson1;

public class CirculationArray {
	
	public int[] solution(int[] A, int k) {
		
		  int b[]=new int[A.length];
		  
		  for(int i=0;i<A.length;i++) {
			  b[(i+k)%A.length]=A[i];
		  }
		  
		  return b;
		
	}
	
	public static void main(String[] args) {
		
	}

}
