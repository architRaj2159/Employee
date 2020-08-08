package com.lti.codility.lesson1;

import java.util.Stack;

public class Nesting{
	public int solution(String S) {
		
		Stack<Character> st = new Stack<Character>();
		if(S.length()%2 != 0) {
			return 0;
		}
		
		if(S.length() == 0) {
			return 1;
		}
		
		for(int i = 0; i<S.length(); i++) {
			char current = S.charAt(i);
			if(current == '(') {
				st.push(current);
			}else {
				if(st.size() == 0) {
					return 0;
				
				}else{
					char popped = (char) st.pop();
					if(popped == '(' && current == ')') {
						continue;
					}else{
						return 0;
					}
				}
			}	
		}
		if(st.isEmpty()) return 1;
		return 0;
	}
	
	public static void main(String[] args) {
		Nesting b = new Nesting();
		String str = "()()";
		int ans = b.solution(str);
		
		System.out.println(ans);
		System.out.println(b.solution("(())"));
		System.out.println(b.solution(""));
		System.out.println(b.solution("()("));
	}
}