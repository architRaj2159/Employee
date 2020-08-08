package com.lti.codility.lesson1;

public class MaxCounter {
	public int[] solution(int[] A, int N) {
		
		int[] counters = new int[N];
        int maxCounter = 0;
        int minCounter = 0;
        for(int i =0; i < A.length; i++){
            if(A[i] >= 1 && A[i] <= N){
                if(counters[A[i]-1] < minCounter){
                    counters[A[i]-1] = minCounter;
                }
                counters[A[i]-1]++;
                if(counters[A[i]-1] > maxCounter){
                    maxCounter = counters[A[i]-1];
                }
            }else if(A[i] == (N + 1)){
                minCounter = maxCounter;
            }
        }
        for(int i = 0; i < counters.length; i++){
            if(counters[i] < minCounter){
                counters[i] = minCounter;
            }
        }
        return counters;
	}
	
	public static void main(String[] args) {
		
	}

}
