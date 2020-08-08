package com.lti.codility.lesson1;

public class SMSExample {
	public int solution(String S, int K) {
		
		String[] words = S.split(" ");
		int count = 1;
		String message = words[0];
		
		if(S.length() == 0 || S.length()<0 || S.length() > 500 || K<0 || K>500) {
			return -1;
		}else if(S.length() > K){
			return -1;
		}else {
			for(int i = 0; i<words.length-1; i++) {
					if(message.length() + 1 + words[i].length() <= K) {
						message += 1 + words[i]; 
					}else {
						count++;
						message = words[i];
					}
				}
		}
		
		return count;
	}
	public static void main(String[] args) {
		SMSExample ss = new SMSExample();
		//String S = "SMS messages are really short";
		//int K = 12;
		//String S = "Hello";
		String S = "Hello Everyone";
		int K = 2;
		System.out.println(ss.solution(S, K));
	}
}
