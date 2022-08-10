package valid_parentheses;

import java.util.Stack;

public class Solution1_noInputConstrain {
	public boolean ValidParentheses(String s) {
		//if it is Bracket, put it into Stack
		Stack stk = new Stack();
		
		String[] split = s.split("");
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals("(") || split[i].equals("[") || split[i].equals("{")) {
				stk.push(split[i]);
			} else if (split[i].equals(")") || split[i].equals("]") || split[i].equals("}")) {
				if (!stk.empty()) {
					String	top = (String) stk.peek();
					switch (split[i]) {
						case ")":
							if (top.equals("(")) {
								stk.pop();
							} else {
								return false;
							}
							break;
						case "]":
							if (top.equals("[")) {
								stk.pop();
							} else {
								return false;
							}
							break;
						case "}":
							if (top.equals("{")) {
								stk.pop();
							} else {
								return false;
							}
							break;
					}
				} else {
					return false;
				}
			}
		}
		
		if (stk.empty()) {
			return true;
		} else {
			return false;
		}
	}
}
