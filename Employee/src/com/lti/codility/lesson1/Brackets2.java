package com.lti.codility.lesson1;

import java.util.Stack;

public class Brackets2 {
    public int solution(String S) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : S.toCharArray()) {
            if(c == '{' || c == '[' || c == '(')
                stack.push(c);
            else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{')
                    return 0;
            }
            else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[')
                    return 0;
            }
            else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(')
                    return 0;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
    
    public static void main(String[] args) {
		Brackets2 bb = new Brackets2();
		String str = "(){}[]";
		System.out.println(bb.solution(str));
	}
}
