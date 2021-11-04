package LC20_ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
	public boolean ValidParentheses(String s) {
		//if it is Bracket, put it into Stack
		Stack stk = new Stack();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
				stk.push(s.charAt(i));
				
			} else if (!stk.empty()) {
				char top = (char) stk.peek();
				if ((s.charAt(i)==')' && top=='(')
					|| (s.charAt(i)==']' && top=='[')
					|| (s.charAt(i)=='}' && top=='{')) {
					stk.pop();
				} else {
					return false;
				}
				
			} else {
				return false;
			}
		}
		
		if (stk.empty()) {
			return true;
		} else {
			return false;
		}
	}
}
