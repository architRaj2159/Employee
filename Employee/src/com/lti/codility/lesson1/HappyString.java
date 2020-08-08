package com.lti.codility.lesson1; 
public class HappyString{ 
	static void generateString(int A, int B, int C){ 
		String rt = ""; 
		while (0 < A || 0 < B || 0 < C) 
		{ 

			// More 'b', append "aabbcc" 
			if (A > B && A > C) 
			{ 
				if (0 < A--){ 
					rt += ('a'); 
				} 
				if (0 < A--){ 
					rt += ('a'); 
				} 
				if (0 < B--) { 
					rt += ('b'); 
				}
				if (0 < B--) {
					rt += ('b');
				}
				if(0 < C--) {
					rt += ('c');
				}
				if(0 < C--) {
					rt += ('c');
				}
			} 
			
			// More 'a', append "aabbc" 
			else if (B > A && B > C) 
			{ 
				if (0 < B--){ 
					rt += ('b'); 
				} 
				if (0 < B--){ 
					rt += ('b'); 
				} 
				if (0 < C--){ 
					rt += ('c'); 
				}
				if (0 < C--){ 
					rt += ('c'); 
				}
				if(0 < A--) {
					rt += ('a');
				}
				if(0 < A--) {
					rt += ('a');
				}
			} 
			
			else if( C > A && C > B) { 
					if (0 < C--){ 
						rt += ('c'); 
					} 
					if (0 < C--){ 
						rt += ('c'); 
					} 
					if (0 < A--){ 
						rt += ('a'); 
					}
					if (0 < A--){ 
						rt += ('a'); 
					}
					if(0 < B--) {
						rt += ('b');
					}
					if(0 < B--) {
						rt += ('b');
					}
			}
			
			// Equal number of 'a' and 'b' 
			// append "ab" 
			else
			{ 
				if (0 < A--) 
				{ 
					rt += ('a'); 
				} 
				if (0 < B--) 
				{ 
					rt += ('b'); 
				} 
			} 
		} 
		System.out.println(rt); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int A = 2, B = 6, C = 4; 
		generateString(A, B, C); 
	} 
} 
 


