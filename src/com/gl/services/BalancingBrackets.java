package com.gl.services;

import java.util.Stack;

public class BalancingBrackets {
	
	private Stack<Character> stack;
	
	
	//Method to verify the given parenthesis string is balanced or not balanced.
	public boolean isBalancedBrackets(String string) {
		
		stack = new Stack<Character>();
		
		for (int i = 0; i < string.length(); i++) {

			char ch = string.charAt(i);

			if (ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);
			} else if ((ch == ']' || ch == '}' || ch == ')') && (!stack.isEmpty())) {
				if (((char) stack.peek() == '(' && ch == ')') || ((char) stack.peek() == '{' && ch == '}') || ((char) stack.peek() == '[' && ch == ']')) {
					stack.pop();
				} else {
					return false;
				}
			} else {
				if ((ch == ']' || ch == '}' || ch == ')')) {
					return false;
				}
			}

		}
		 
		return stack.isEmpty();
	}
	
	

}
